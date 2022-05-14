package mx.tv.gameswinner.dragongame.personajes;
public abstract class Personaje{
	protected String nombre;
	protected int vida = 3;

	public int obtenVida(){
		return vida;
	}
	public String obtenNombre(){
		return nombre;
	}
	public boolean addVida(){
		return addVida(1);
	}
	public abstract boolean decVida();

	public boolean addVida(int vida){
		if (this.vida+vida > 99) {
			return false;
		}else {
			this.vida = this.vida + vida;
			return true;
		}
	}
	public abstract boolean decVida(int vida);

	public String modificarNombre(String nombre){
		this.nombre = nombre;
		return this.nombre;
	}
	public String obtenerDetalles(){
		return "Nombre: " + nombre + " Vida: " + vida;
	}
	public String toString(){
		return obtenerDetalles();
	}
}