package ar.edu.ort.tp1.tp3Ejercicio05.incompleto;

public class TorneoFutbol11 extends TorneoFutbol {

	private static final int PUNTOS_GANADO = 3;

	public TorneoFutbol11() {
	}

	@Override
	public String getTipo() {
		return "Torneo de futbol 11";
	}

	@Override
	public int puntajePartidoGanado() {
		return PUNTOS_GANADO;
	}

	@Override
	public int puntajePartidoPerdido() {
		return 0;
	}

	@Override
	public int puntajeVallaInvicta() {
		return 0;
	}

	@Override
	public int puntajeGanador4Goles() {
		return 0;
	}

	@Override
	public int puntajeEmpateMas3Goles() {
		return 0;
	}

}
