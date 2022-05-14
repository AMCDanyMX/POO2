package mx.tv.gameswinner.dragongame.utilerias;
public enum Ataque {
	HI("Alto", 3),
	MED("Medio", 2),
	LOW("Bajo", 1);

	private final String tipo;
	private final int dano;

	public String getTipo() {
		return tipo;
	}
	public int getDano() {
		return dano;
	}

	private Ataque(String tipo, int dano) {
		this.tipo = tipo;
		this.dano = dano;
	}
}