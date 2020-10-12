package ar.edu.ort.tp1.tp3Ejercicio05.incompleto;

import java.util.ArrayList;

public abstract class TorneoFutbol {
	private ArrayList<Jornada> jornadas;
	private ArrayList<Equipo> equipos;

	public TorneoFutbol() {
		this.jornadas = new ArrayList<>();
		this.equipos = new ArrayList<>();
	}

	public void agregarJornada(Jornada jornada) {
		this.jornadas.add(jornada);
	}

	public void eliminarJornada(Jornada jornada) {
		this.jornadas.remove(jornada);
	}

	public void agregarEquipo(Equipo equipo) {
		this.equipos.add(equipo);
	}

	public void eliminarEquipo(Equipo equipo) {
		this.equipos.remove(equipo);
	}

	public void finalizarJornada(Jornada jornada) {
		if (jornadas.contains(jornada)) {
			jornada.getPartidos().forEach(this::calcularPuntos);
			mostrarTabla(jornada);
		}
	}

	public void mostrarTabla(Jornada jornada) {
		System.out.println(getTipo());
		System.out.println("Tabla de posiciones al cabo de " + jornada.getFecha() + " fechas:");

		equipos.forEach(x-> System.out.println(x.toString()));
	}

	public abstract String getTipo();

	public void calcularPuntos(Partido partido) {
		int puntosLocal = 0;
		int puntosVisitante = 0;
		int golesEquipoLocal = partido.getGolesEquipoLocal();
		int golesEquipoVisitante = partido.getGolesEquipoVisitante();

		if (golesEquipoLocal > golesEquipoVisitante)//Si gana el local
		{
			puntosLocal += puntajePartidoGanado();
			puntosLocal += golesEquipoLocal - golesEquipoVisitante > 4 ? puntajeGanador4Goles() : 0;
			puntosLocal += golesEquipoVisitante == 0 ? puntajeVallaInvicta() : 0;

			partido.getEquipoLocal().setPuntos(puntosLocal);

			puntosVisitante = puntajePartidoPerdido();

			partido.getEquipoVisitante().setPuntos(puntosVisitante);

		} else if (golesEquipoVisitante > golesEquipoLocal) {//Si gana el visitante

			puntosVisitante += puntajePartidoGanado();
			puntosVisitante += golesEquipoVisitante - golesEquipoLocal > 4 ? puntajeGanador4Goles() : 0;
			puntosVisitante += golesEquipoLocal == 0 ? puntajeVallaInvicta() : 0;

			partido.getEquipoVisitante().setPuntos(puntosVisitante);

			puntosLocal += puntajePartidoPerdido();

			partido.getEquipoLocal().setPuntos(puntosLocal);
		} else {
			partido.getEquipoVisitante().setPuntos(puntajePartidoEmpatado());
			partido.getEquipoLocal().setPuntos(puntajePartidoEmpatado());

			if (golesEquipoLocal > 3) {
				partido.getEquipoLocal().setPuntos(puntajeEmpateMas3Goles());
				partido.getEquipoVisitante().setPuntos(puntajeEmpateMas3Goles());
			}
		}
	}

	public int puntajePartidoEmpatado() {
		return 1;
	}

	public abstract int puntajePartidoGanado();

	public abstract int puntajePartidoPerdido();

	public abstract int puntajeVallaInvicta();

	public abstract int puntajeGanador4Goles();

	public abstract int puntajeEmpateMas3Goles();
}
