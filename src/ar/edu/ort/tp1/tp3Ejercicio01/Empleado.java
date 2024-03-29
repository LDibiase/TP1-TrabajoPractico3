package ar.edu.ort.tp1.tp3Ejercicio01;

public abstract class Empleado {

	private String nombre;
	private int edad;

	public Empleado() {
	}

	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float calcularPago() {
		return 0.0f;
	}

	public String toString() {
		return "[Nombre=" + nombre + ", edad=" + edad;
	}
}
