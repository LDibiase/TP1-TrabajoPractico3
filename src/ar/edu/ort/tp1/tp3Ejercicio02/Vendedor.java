package ar.edu.ort.tp1.tp3Ejercicio02;

import ar.edu.ort.tp1.tp3Ejercicio01.SubContratado;

public class Vendedor extends SubContratado {
	private float porcentaje;

	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() {
		return "Vendedor " + super.toStringSinClase() + ", porcentaje=" + porcentaje +  ']';
	}

	@Override
	public float calcularPago() {
		return super.calcularPago() + (super.calcularPago() * porcentaje) / 100;
	}

}
