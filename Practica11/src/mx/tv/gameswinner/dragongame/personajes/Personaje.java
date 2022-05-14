package mx.tv.gameswinner.dragongame.personajes;
import mx.tv.gameswinner.dragongame.utilerias.AddErrores;
public abstract class Personaje{
	protected String nombre;
	protected int vida = 3;

	public int obtenVida(){
		return vida;
	}
	public String obtenNombre(){
		return nombre;
	}
	public boolean addVida() throws AddErrores{
		return addVida(1);
	}
	public abstract boolean decVida();

	public boolean addVida(int vida) throws AddErrores{
		if (this.vida + vida < 0) {
			throw new AddErrores("La vida no puede ser < 0", (this.vida + vida));
		}
		if (this.vida + vida > 99) {
			throw new AddErrores("La vida no puede ser > 99", (this.vida + vida));
		}
		if (this.vida + vida % 5 == 0) {
			throw new AddErrores("La vida no puede ser multiplo de 5", (this.vida + vida));
		}
		this.vida = this.vida + vida;
		return true;
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