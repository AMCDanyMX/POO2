package mx.tv.gameswinner.dragongame.personajes;
public class Planta extends Personaje{
	private String escudo = "A";

	public Planta(String nombre, int vida, String escudo){
		super(nombre, vida);
		this.escudo = escudo;
	}
	public Planta(String nombre, String escudo){
		super(nombre);
		this.escudo = escudo;
	}
	public Planta(String nombre, int vida){
		super(nombre, vida);
	}
	public Planta(String nombre){
		super(nombre);
	}

	public boolean decVida(){
		return super.decVida();
	}
	public boolean decVida(int vida){
		if (escudo == "A") {
			vida = vida * 2;
			return super.decVida(vida);
		}else {
			return super.decVida(vida);
		}
	}
	public String regresaEscudo(){
		return escudo;
	}
	public String obtenerDetalles(){
		return super.obtenerDetalles() + " Escudo: " + escudo;
	}
}