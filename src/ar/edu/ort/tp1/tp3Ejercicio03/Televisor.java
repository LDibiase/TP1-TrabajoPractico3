package ar.edu.ort.tp1.tp3Ejercicio03;

public class Televisor extends Electrodomestico {
	private int dimension;
	private boolean esSmart;

	public Televisor(String marca, String modelo, int numeroDeSerie, int voltaje, boolean estado, float precio, int dimension, boolean esSmart) {
		super(marca, modelo, numeroDeSerie, voltaje, estado, precio);
		this.dimension = dimension;
		this.esSmart = esSmart;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public boolean isEsSmart() {
		return esSmart;
	}

	public void setEsSmart(boolean esSmart) {
		this.esSmart = esSmart;
	}

	@Override
	public String mostrarProducto() {
		return "Televisor " + super.mostrarProducto() + " ]";
	}

	@Override
	public String mostrarInfoYPrecio() {
		return "Televisor " + (this.esSmart ? "Smart " : "") + getMarca() + " " + this.dimension + " pulgadas, " + getModelo() + ": $" + getPrecio();
	}
}
