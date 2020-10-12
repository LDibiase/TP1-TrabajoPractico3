package ar.edu.ort.tp1.tp3Ejercicio03;

public class Heladera extends Electrodomestico {

	private float capacidad;
	private boolean esNoFrost;

	public Heladera(String marca, String modelo, int numeroDeSerie, int voltaje, boolean estado, float precio, float capacidad, boolean esNoFrost) {
		super(marca, modelo, numeroDeSerie, voltaje, estado, precio);
		this.capacidad = capacidad;
		this.esNoFrost = esNoFrost;
	}

	public float getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isEsNoFrost() {
		return esNoFrost;
	}

	public void setEsNoFrost(boolean esNoFrost) {
		this.esNoFrost = esNoFrost;
	}

	@Override
	public String mostrarProducto() {
		return "Heladera " + super.mostrarProducto() + " ]";
	}

	@Override
	public String mostrarInfoYPrecio() {
		return "Heladera " + getMarca() + ", modelo " + getModelo() + (this.esNoFrost ? "no frost" : "")  + ", capacidad " + this.capacidad + " litros: $" + this.getPrecio();
	}
}
