package ar.edu.ort.tp1.tp3Ejercicio01;

public class TP2Test1 {

	public static void main(String[] args) {
		Asalariado asalariado = new Asalariado("José", 30, 10000f);
		SubContratado subContratado = new SubContratado("Carlos", 23, 50, 100);

		System.out.println(asalariado.toString());
		System.out.println(subContratado.toString());
	}
}
