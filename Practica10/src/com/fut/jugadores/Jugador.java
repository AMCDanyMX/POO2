package com.fut.jugadores;
import com.fut.utilerias.*;
public class Jugador {
	private String nombre;
	private Posicion posicion;

	public Jugador(String nombre, Posicion posicion) {
		this.nombre = nombre;
		this.posicion = posicion;
	}

	public float getCos() {
		return posicion.getDin();
	}

	public String toString() {
		return "nombre: " + nombre + " posicion: " + posicion.getPos() + " costo: " + posicion.getDin(); 
	}
} 