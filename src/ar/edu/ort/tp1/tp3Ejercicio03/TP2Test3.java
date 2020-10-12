package ar.edu.ort.tp1.tp3Ejercicio03;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TP2Test3 {

	public static void main(String[] args) {

		Heladera heladera = new Heladera("Whirpool", "H2745", 1234, 220, false, 10500f, 100f, true);
		Lavarropas lavarropas = new Lavarropas("Samsung", "S410", 4321, 220, false, 7690.80f, 50, TipoLavarropas.AUTOMATICO);
		Licuadora licuadora = new Licuadora("TOPHOUSE", "T90", 987, 220, false, 1900f, 70, 4);
		Televisor televisor = new Televisor("TEDGE", "TG1010", 6543, 220, false, 20250.30f, 40, true);

		List<Electrodomestico> productos = new ArrayList<>(Arrays.asList(heladera, lavarropas, licuadora, televisor));

		mostrarListado(productos);

		int opcion = 0;
		Ticket ticket = new Ticket();
		float acumPrecio = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			opcion = solicitarIngreso(productos.size(), scanner);

			if (opcion != 0) {
				ticket.agregarProducto(productos.get(opcion - 1));
				acumPrecio += productos.get(opcion -1).getPrecio();
			}

		} while (opcion != 0);

		scanner.close();
		mostrarTicket(ticket, acumPrecio);
	}

	private static int solicitarIngreso(int cantidadArticulos, Scanner scanner) {
		int opcion = 0;

		do {
			System.out.println("Ingrese una opción o '0' para finalizar");
			opcion = scanner.nextInt();
		} while (opcion > cantidadArticulos);

		return opcion;
	}

	private static void mostrarListado(List<Electrodomestico> productos) {
		for(int i = 0; i < productos.size(); i++) {
			System.out.println("Opción " + (i+1) + ": " + productos.get(i).mostrarProducto());
		}
	}

	private static void mostrarTicket(Ticket ticket, float total) {
		System.out.println("Ticket de venta");
		System.out.println("Articulos:");
		ticket.getProductos().forEach(x -> System.out.println(x.mostrarInfoYPrecio()));
		System.out.println("Total: $" + total);
	}
}
