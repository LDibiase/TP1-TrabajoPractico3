package ar.edu.ort.tp1.tp3Ejercicio03;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

	private List<Electrodomestico> productos;

	public Ticket() {
		this.productos = new ArrayList<>();
	}

	public List<Electrodomestico> getProductos() {
		return productos;
	}

	public void agregarProducto(Electrodomestico electrodomestico) {
		this.productos.add(electrodomestico);
	}
}
