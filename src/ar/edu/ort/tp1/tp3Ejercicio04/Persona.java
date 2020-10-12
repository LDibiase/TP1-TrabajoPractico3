package ar.edu.ort.tp1.tp3Ejercicio04;

public abstract class Persona {
	private String nombre;
	private String horaIngreso;
	private String horaSalida;

	public Persona() {
	}

	public Persona(String nombre, String horaIngreso, String horaSalida) {
		this.nombre = nombre;
		this.horaIngreso = horaIngreso;
		this.horaSalida = horaSalida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHoraIngreso() {
		return horaIngreso;
	}

	public void setHoraIngreso(String horaIngreso) {
		this.horaIngreso = horaIngreso;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}
}
