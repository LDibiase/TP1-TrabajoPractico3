package ar.edu.ort.tp1.tp3Ejercicio03;

public class Licuadora extends Electrodomestico {
	private float potencia;
	private int cantidadVelocidades;

	public Licuadora(String marca, String modelo, int numeroDeSerie, int voltaje, boolean estado, float precio, float potencia, int cantidadVelocidades) {
		super(marca, modelo, numeroDeSerie, voltaje, estado, precio);
		this.potencia = potencia;
		this.cantidadVelocidades = cantidadVelocidades;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public int getCantidadVelocidades() {
		return cantidadVelocidades;
	}

	public void setCantidadVelocidades(int cantidadVelocidades) {
		this.cantidadVelocidades = cantidadVelocidades;
	}

	@Override
	public String mostrarProducto() {
		return "Licuadora " + super.mostrarProducto() + " ]";
	}

	@Override
	public String mostrarInfoYPrecio() {
		return "Licuadora " + getMarca() + " " + getModelo() + ", " + this.potencia + ", " + this.cantidadVelocidades + " velocidades: $" + getPrecio();
	}
}
