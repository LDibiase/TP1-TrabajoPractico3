package ar.edu.ort.tp1.tp3Ejercicio03;

public class Lavarropas extends Electrodomestico {

	private int cargaMaxima;
	private TipoLavarropas tipoLavarropas;

	public Lavarropas(String marca, String modelo, int numeroDeSerie, int voltaje, boolean estado, float precio, int cargaMaxima, TipoLavarropas tipoLavarropas) {
		super(marca, modelo, numeroDeSerie, voltaje, estado, precio);
		this.cargaMaxima = cargaMaxima;
		this.tipoLavarropas = tipoLavarropas;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public TipoLavarropas getTipoLavarropas() {
		return tipoLavarropas;
	}

	public void setTipoLavarropas(TipoLavarropas tipoLavarropas) {
		this.tipoLavarropas = tipoLavarropas;
	}

	@Override
	public String mostrarProducto() {
		return "Lavarropas " + super.mostrarProducto() + " ]";
	}

	@Override
	public String mostrarInfoYPrecio() {
		return "Lavarropas " + getMarca() + " " + this.tipoLavarropas.name().toLowerCase() + ", carga maxima " + this.cargaMaxima + " kg, modelo " + getModelo() + ": $" + getPrecio();
	}
}
