package ar.edu.ort.tp1.tp3Ejercicio03;

public abstract class Electrodomestico {
	private String marca;
	private String modelo;
	private int numeroDeSerie;
	private int voltaje;
	private boolean estado;
	private float precio;

	public Electrodomestico(String marca, String modelo, int numeroDeSerie, int voltaje, boolean estado, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroDeSerie = numeroDeSerie;
		this.voltaje = voltaje;
		this.estado = estado;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public void setNumeroDeSerie(int numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	public int getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String mostrarProducto() {
		return "[Marca: " + this.marca + ", Modelo: " + this.modelo;
	}

	public abstract String mostrarInfoYPrecio();
}
