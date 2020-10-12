package ar.edu.ort.tp1.tp3Ejercicio04;

import java.util.ArrayList;
import java.util.List;

public class Cuidador extends Persona {

	private int cantidadDeAnimales;
	private List<AnimalMarino> animalesCuidados;

	public Cuidador(String nombre, String horaIngreso, String horaSalida, int cantidadDeAnimales) {
		super(nombre, horaIngreso, horaSalida);
		this.cantidadDeAnimales = cantidadDeAnimales;
		this.animalesCuidados = new ArrayList<>();
	}

	public int getCantidadDeAnimales() {
		return cantidadDeAnimales;
	}

	public void setCantidadDeAnimales(int cantidadDeAnimales) {
		this.cantidadDeAnimales = cantidadDeAnimales;
	}

	public List<AnimalMarino> getAnimalesCuidados() {
		return animalesCuidados;
	}

	public boolean agregarAnimal(AnimalMarino animalMarino) {
		boolean pudoAgregar = false;

		if (this.tieneLugar()) {
			this.animalesCuidados.add(animalMarino);
			pudoAgregar = true;
		}

		return pudoAgregar;
	}

	private boolean tieneLugar() {
		return this.animalesCuidados.size() < this.cantidadDeAnimales;
	}

	public AnimalMarino obtenerAnimal(String nombre) {
		int i = 0;
		boolean encontrado = false;
		AnimalMarino animalMarino = null;

		while(!encontrado && i < animalesCuidados.size()) {

			if (animalesCuidados.get(i).getNombre().equalsIgnoreCase(nombre)) {
				animalMarino = animalesCuidados.get(i);
				encontrado = true;
			}
			i++;
		}
		return animalMarino;
	}

}
