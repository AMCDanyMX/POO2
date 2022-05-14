package com.nem.practicl13.personas;
public class Apostador extends Persona implements Comparable<Apostador> {
	private float dinero;
	private int punto;

	public Apostador(String nombre, String apellido, int edad, float dinero, int punto) {
		super(nombre, apellido, edad);
		this.dinero = dinero;
		this.punto = punto;
	}

	public float getDinero() {
		return dinero;
	}

	public int getPunto() {
		return punto;
	}

	public String toString() {
		return super.toString() + " " + dinero + " " + punto;
	}

	public int compareTo(Apostador o) {
		return (int)o.dinero - (int)this.dinero;
	}
}