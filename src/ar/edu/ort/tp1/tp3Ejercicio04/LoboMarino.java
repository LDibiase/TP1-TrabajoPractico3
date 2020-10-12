package ar.edu.ort.tp1.tp3Ejercicio04;

import java.util.List;

public class LoboMarino extends AnimalMarino {

	public LoboMarino(String nombre, float peso, float tamaño, List<Habilidad> habilidades) {
		super(nombre, peso, tamaño, habilidades);
	}

	@Override
	public String toString() {
		return "LoboMarino " + getNombre();
	}
}
