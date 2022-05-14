package mx.tv.gameswinner.dragongame.personajes;
public class Zombie extends Personaje{
	private boolean ataque = false;

	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre, vida);
		this.ataque = ataque;
	}
	public Zombie(String nombre, boolean ataque){
		super(nombre);
		this.ataque = ataque;
	}
	public Zombie(String nombre){
		super(nombre);
	}

	public boolean decVida(){
		return super.decVida();
	}
	public boolean decVida(int vida){
		if (ataque == false) {
			vida = vida * 3;
			return super.decVida(vida);
		}else {
			vida = vida * 2;
			return super.decVida(vida);
		}
	}
	public boolean regresaAtaque(){
		return ataque;
	}
	public String obtenerDetalles(){
		return super.obtenerDetalles() + " Ataque: " + ataque;
	}
	public String toString(){
		return super.toString() + " Ataque: " + ataque;
	}
	public boolean equals(Object o){
		if (!(o instanceof Zombie)) {
			return false;
		}
		Zombie zom = (Zombie) o;
		if ((obtenNombre().equals(zom.obtenNombre())) && (obtenVida() == zom.obtenVida()) && (ataque == zom.ataque)){
			return true;
		}else {
			return false;
		}
	}
}