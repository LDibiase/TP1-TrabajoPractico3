package ar.edu.ort.tp1.tp3Ejercicio01;

public class SubContratado extends Empleado {

	private float cantHoras;
	private float precioHora;

	public SubContratado() {
	}

	//Extiende de la super clase
	public SubContratado(String nombre, int edad, float cantHoras, float precioHora) {
		super(nombre, edad);
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}

	//Especializa la super clase
	@Override
	public String toString() {
		return "SubContratado " + super.toString() + ", cantHoras=" + cantHoras + ", precioHora=" + this.precioHora +  ']';
	}

	public String toStringSinClase() {
		return super.toString() + ", cantHoras=" + cantHoras + ", precioHora=" + this.precioHora;
	}

	//Especializa la super clase
	@Override
	public float calcularPago() {
		return this.precioHora * this.cantHoras;
	}
}
