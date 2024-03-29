package ar.edu.ort.tp1.tp3Ejercicio05.incompleto;

public class TorneoFutbol8 extends TorneoFutbol {
	private static final int PUNTOS_GANADO = 3;

	public TorneoFutbol8() {
	}

	@Override
	public String getTipo() {
		return "Torneo de futbol 8";
	}

	@Override
	public int puntajePartidoGanado() {
		return PUNTOS_GANADO;
	}

	@Override
	public int puntajePartidoPerdido() {
		return 1;
	}

	@Override
	public int puntajeVallaInvicta() {
		return 1;
	}

	@Override
	public int puntajeGanador4Goles() {
		return 0;
	}

	@Override
	public int puntajeEmpateMas3Goles() {
		return 1;
	}

}
