package mx.tv.gameswinner.dragongame.personajes;
public class Personaje{
	private String nombre;
	private int vida = 3;

	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		if (vida > 0 && vida < 100){
			this.vida = vida;
		}
	}
	public Personaje(String nombre){
		this.nombre = nombre;
	}

	public int obtenVida(){
		return vida;
	}
	public String obtenNombre(){
		return nombre;
	}
	public boolean addVida(){
		return addVida(1);
	}
	public boolean decVida(){
		return decVida(1);
	}
	public boolean addVida(int vida){
		if (this.vida+vida > 99) {
			return false;
		}else {
			this.vida = this.vida + vida;
			return true;
		}
	}
	public boolean decVida(int vida){
		if (this.vida-vida < 0) {
			return false;
		}else {
			this.vida = this.vida - vida;
			return true;
		}
	}
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
	public boolean equals(Object o){
		if (!(o instanceof Personaje)) {
			return false;
		}
		Personaje per = (Personaje) o;
		if ((nombre.equals(per.nombre)) && (vida == per.vida)){
			return true;
		}else {
			return false;
		}
	}
}