package ar.edu.ort.tp1.tp3Ejercicio04;

public class Habilidad {
	private float cantidadDeAlimento;
	private String nombre;

	public Habilidad(float cantidadDeAlimento, String nombre) {
		this.cantidadDeAlimento = cantidadDeAlimento;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public float getCantidadDeAlimento() {
		return cantidadDeAlimento;
	}
}
