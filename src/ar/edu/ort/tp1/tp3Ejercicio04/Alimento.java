package ar.edu.ort.tp1.tp3Ejercicio04;

public class Alimento {

	private float stock;
	private String nombre;

	public Alimento(float stock, String nombre) {
		this.stock = stock;
		this.nombre = nombre;
	}

	public void consumir(float cantidad) {
		this.stock -= cantidad;
	}
}
