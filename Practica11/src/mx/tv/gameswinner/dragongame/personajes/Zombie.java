package mx.tv.gameswinner.dragongame.personajes;
import mx.tv.gameswinner.dragongame.utilerias.Ataque;
public class Zombie extends Personaje{
	private Ataque ataque = Ataque.HI;

	public Zombie(String nombre, int vida, Ataque ataque){
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
	}
	public Zombie(String nombre, Ataque ataque){
		this.nombre = nombre;
		this.ataque = ataque;
	}
	public Zombie(String nombre){
		this.nombre = nombre;
	}

	public boolean decVida(){
		return decVida(1);
	}
	public boolean decVida(int vida){
		if (this.vida - (vida * ataque.getDano()) < 0) {
			return false;
		}else {
			this.vida = this.vida - (vida * ataque.getDano());
			return true;
		}
	}
	public Ataque regresaAtaque(){
		return ataque;
	}
	public String toString(){
		return super.toString() + " Ataque: " + ataque.getTipo();
	}
	public boolean equals(Object o){
		if (!(o instanceof Zombie)) {
			return false;
		}
		Zombie zom = (Zombie) o;
		if ((nombre.equals(zom.nombre)) && (vida == zom.vida) && (ataque.getDano() == zom.ataque.getDano())){
			return true;
		}else {
			return false;
		}
	}
}