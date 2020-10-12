package ar.edu.ort.tp1.tp3Ejercicio04;

import java.util.List;

public class Delfin extends AnimalMarino {

	private Entrenador entrenador;

	public Delfin(String nombre, float peso, float tamaño, List<Habilidad> habilidades, Entrenador entrenador) {
		super(nombre, peso, tamaño, habilidades);
		this.entrenador = entrenador;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	@Override
	public String toString() {
		return "Delfin " + getNombre();
	}
}
