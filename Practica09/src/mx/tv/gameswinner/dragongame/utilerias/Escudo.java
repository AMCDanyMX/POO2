package mx.tv.gameswinner.dragongame.utilerias;
public enum Escudo {
	PRO("Protejido", 3),
	NOPRO("No Protejido", 1);

	private final String pro;
	private final int res;

	public String getPro() {
		return pro;
	}
	public int getRes() {
		return res;
	}

	private Escudo(String pro, int res) {
		this.pro = pro;
		this.res = res;
	}
}