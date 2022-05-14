package com.fut.utilerias;
public enum Posicion {
	POR("Portero", 1000.00F),
	DEF("Defensa", 2000.00F),
	MED("Medio",2500.00F),
	DEL("Delantero", 654321.02F);

	private final String pos;
	private final float din;

	private Posicion(String pos, float din) {
		this.pos = pos;
		this.din = din;
	}

	public String getPos() {
		return pos;
	}
	public float getDin() {
		return din;
	}
}