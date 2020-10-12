package ar.edu.ort.tp1.tp3Ejercicio04;

public class Entrenador extends Persona {

	private int aniosExperiencia;

	public Entrenador(String nombre, String horaIngreso, String horaSalida, int aniosExperiencia) {
		super(nombre, horaIngreso, horaSalida);
		this.aniosExperiencia = aniosExperiencia;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
}
