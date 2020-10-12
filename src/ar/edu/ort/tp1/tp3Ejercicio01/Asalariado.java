package ar.edu.ort.tp1.tp3Ejercicio01;

public class Asalariado extends Empleado {

	private float sueldo;

	public Asalariado() {

	}

	//Extiende de la super clase
	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}

	//Especializa la super clase
	@Override
	public String toString() {
		return "Asalariado " + super.toString() + ", " + "sueldo=" + sueldo + ']';
	}

	//Especializa la super clase
	@Override
	public float calcularPago() {
		return this.sueldo;
	}
}
