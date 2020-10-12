package ar.edu.ort.tp1.tp3Ejercicio04;

import java.util.List;

public abstract class AnimalMarino {
	private String nombre;
	private float peso;
	private float tamaño;
	private List<Habilidad> habilidades;

	public AnimalMarino() {
	}

	public AnimalMarino(String nombre, float peso, float tamaño, List<Habilidad> habilidades) {
		this.nombre = nombre;
		this.peso = peso;
		this.tamaño = tamaño;
		this.habilidades = habilidades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getTamaño() {
		return tamaño;
	}

	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}

	public List<Habilidad> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}

	public float realizarTruco(String nombreTruco) {
		float kilos = 0;

		Habilidad habilidad = this.buscarHabilidad(nombreTruco);

		if (habilidad != null) {
			kilos = habilidad.getCantidadDeAlimento();
		}

		return kilos;
	}

	public Habilidad buscarHabilidad(String nombreTruco) {
		boolean encontrado = false;
		int i = 0;
		Habilidad habilidad = null;

		while(!encontrado) {

			if (habilidades.get(i).getNombre().equalsIgnoreCase(nombreTruco)) {
				habilidad = habilidades.get(i);
				encontrado = true;
			}

			i++;
		}

		return habilidad;
	}
}
