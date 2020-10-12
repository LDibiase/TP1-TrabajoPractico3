package ar.edu.ort.tp1.tp3Ejercicio04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Show {
	public static void main(String[] args) {

		Map<String, Float> alimentos = new HashMap<>();

		alimentos.put("Calamar", 50f);
		alimentos.put("Pulpo", 30f);
		alimentos.put("Cangrejo", 25f);

		List<Cuidador> cuidadores = new ArrayList<>();

		crearAnimal(new Delfin("Flipper", 50, 70,
				Arrays.asList(new Habilidad(5, "truco 1"), new Habilidad(10, "truco 2")),
				new Entrenador("Luis", "0AM", "3PM", 10)), cuidadores);

		crearAnimal(new Orca("Willy", 400, 2000,
				Arrays.asList(new Habilidad(20, "truco 1"), new Habilidad(15, "truco 2"))), cuidadores);

		crearAnimal(new Delfin("Kuni", 40, 50,
				Arrays.asList(new Habilidad(5, "truco 1"), new Habilidad(10, "truco 2")),
				new Entrenador("Pepe", "0AM", "3PM", 10)), cuidadores);

		crearAnimal(new LoboMarino("Rupert", 100, 400, Arrays.asList(new Habilidad(13, "truco 1"))), cuidadores);

		mostrarStock(alimentos);
		System.out.println("Comienza el Show!");

		realizarTruco("truco 1", "Rupert", cuidadores, alimentos);
		realizarTruco("truco 1", "Willy", cuidadores, alimentos);
		realizarTruco("truco 1", "Flipper", cuidadores, alimentos);
		realizarTruco("truco 1", "Kuni", cuidadores, alimentos);
		realizarTruco("truco 1", "Willy", cuidadores, alimentos);
		realizarTruco("truco 1", "Willy", cuidadores, alimentos);

		mostrarStock(alimentos);
	}

	private static void mostrarStock(Map<String, Float> alimentos) {
		System.out.println("Stock de alimento: ");

		for (Map.Entry<String, Float> entry : alimentos.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + "kg");
		}
	}

	private static void realizarTruco(String nombreTruco, String nombreAnimal, List<Cuidador> cuidadores, Map<String, Float> alimentos) {
		AnimalMarino animalMarino;
		animalMarino = buscaAnimal(nombreAnimal, cuidadores);
		boolean pudoRealizar = false;

		if (animalMarino != null) {
			Habilidad habilidad = animalMarino.buscarHabilidad(nombreTruco);

			if (habilidad != null) {
				pudoRealizar = realizarActividad(animalMarino, habilidad, alimentos);

				if (!pudoRealizar) {
					System.out.println(animalMarino.toString() + " se le ordenó realizar " + nombreTruco + ", pero no tiene suficiente alimento");
					System.out.println("FIN DEL SHOW");
				}
			}
		}
	}

	private static boolean realizarActividad(AnimalMarino animalMarino, Habilidad habilidad, Map<String, Float> alimentos) {
		boolean puedeRealizar = false;

		if (animalMarino instanceof Delfin) {
			puedeRealizar = alimentos.get("Pulpo") > habilidad.getCantidadDeAlimento();

			if (puedeRealizar) {
				alimentos.put("Pulpo", alimentos.get("Pulpo") - animalMarino.realizarTruco(habilidad.getNombre()));
				System.out.println(animalMarino.toString() + " realizó " + habilidad.getNombre() + " y recibió " + habilidad.getCantidadDeAlimento() + "kg de Pulpo");
			}
		}

		if (animalMarino instanceof Orca) {
			puedeRealizar = alimentos.get("Calamar") > habilidad.getCantidadDeAlimento();

			if (puedeRealizar) {
				alimentos.put("Calamar", alimentos.get("Calamar") - animalMarino.realizarTruco(habilidad.getNombre()));
				System.out.println(animalMarino.toString() + " realizó " + habilidad.getNombre() + " y recibió " + habilidad.getCantidadDeAlimento() + "kg de Calamar");
			}
		}

		if (animalMarino instanceof LoboMarino) {
			puedeRealizar = alimentos.get("Cangrejo") > habilidad.getCantidadDeAlimento();

			if (puedeRealizar) {
				alimentos.put("Cangrejo", alimentos.get("Cangrejo") - animalMarino.realizarTruco(habilidad.getNombre()));
				System.out.println(animalMarino.toString() + " realizó " + habilidad.getNombre() + " y recibió " + habilidad.getCantidadDeAlimento() + "kg de Cangrejo");
			}
		}

		return puedeRealizar;

	}

	private static AnimalMarino buscaAnimal(String nombreAnimal, List<Cuidador> cuidadores) {
		AnimalMarino animalMarino = null;
		boolean encontrado = false;
		int i = 0;

		while(!encontrado && i < cuidadores.size()) {
			animalMarino = cuidadores.get(i).obtenerAnimal(nombreAnimal);
			if (animalMarino != null) {
				encontrado = true;
			}
			i++;
		}

		return animalMarino;
	}

	private static void crearAnimal(AnimalMarino animalMarino, List<Cuidador> cuidadores) {

		boolean pudoAgregar = false;
		int i=0;

		while (!pudoAgregar && i < cuidadores.size()) {
			pudoAgregar = cuidadores.get(i).agregarAnimal(animalMarino);
			i++;
		}

		if (!pudoAgregar) {
			Cuidador nuevoCuidador = new Cuidador("José", "9AM", "8PM", 3);
			nuevoCuidador.agregarAnimal(animalMarino);
			cuidadores.add(nuevoCuidador);
		}
	}
}
