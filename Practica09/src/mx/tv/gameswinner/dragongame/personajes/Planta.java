package mx.tv.gameswinner.dragongame.personajes;
import mx.tv.gameswinner.dragongame.utilerias.Escudo;
public class Planta extends Personaje{
	private Escudo escudo = Escudo.NOPRO;

	public Planta(String nombre, int vida, Escudo escudo){
		this.nombre = nombre;
		this.vida = vida;
		this.escudo = escudo;
	}
	public Planta(String nombre, Escudo escudo){
		this.nombre = nombre;
		this.escudo = escudo;
	}
	public Planta(String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
	}
	public Planta(String nombre){
		this.nombre = nombre;
	}

	public boolean decVida(){
		return decVida(1);
	}
	public boolean decVida(int vida){
		if (this.vida - (vida * escudo.getRes()) < 0) {
			return false;
		}else {
			this.vida = this.vida - (vida * escudo.getRes());
			return true;
		}
	}
	public Escudo regresaEscudo(){
		return escudo;
	}
	public String toString(){
		return super.toString() + " Escudo: " + escudo.getPro();
	}
	public boolean equals(Object o){
		if (!(o instanceof Planta)) {
			return false;
		}
		Planta pla = (Planta) o;
		if ((nombre.equals(pla.nombre)) && (vida == pla.vida) && (escudo.getRes() == pla.escudo.getRes())){
			return true;
		}else {
			return false;
		}
	}
}