package com.fut.pruebas;
import com.fut.jugadores.*;
import com.fut.utilerias.*;
public class PruebaCostos {
	public static void main(String[] args) {
		float dinero = 0.00F;

		Jugador[] equipo = {
			new Jugador("Ochoa", Posicion.POR),
			new Jugador("Corona", Posicion.POR),
			new Jugador("Puyol", Posicion.POR),
			new Jugador("Herrera", Posicion.POR),
			new Jugador("Alexis", Posicion.POR),
			new Jugador("Kala", Posicion.POR),
			new Jugador("Ronaldo", Posicion.POR),
			new Jugador("Messi", Posicion.POR)
		};

		for (Jugador tmp : equipo) {
			System.out.println(tmp.toString());
			dinero += tmp.getCos();
		}

		System.out.println("costo total del equipo: " + dinero);
	}
}