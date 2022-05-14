package com.nem.practicl13.personas;
public class Estudiante extends Persona implements Comparable<Estudiante> {
	private int matricula;
	private float calificacion;

	public Estudiante(String nombre, String apellido, int edad, int matricula, float calificacion) {
		super(nombre, apellido, edad);
		this.matricula = matricula;
		this.calificacion = calificacion;
	}

	public int getMatricula() {
		return matricula;
	}

	public float getCalificacion() {
		return calificacion;
	}

	public  String toString() {
		return super.toString() + " " + matricula + " " + calificacion;
	}

	public int compareTo(Estudiante o) {
		return (int)o.calificacion - (int)this.calificacion;
	}
}