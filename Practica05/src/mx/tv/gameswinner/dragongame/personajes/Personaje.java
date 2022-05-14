//hora de inicio: 10:32
//hora de finalizacion: 11:57
package mx.tv.gameswinner.dragongame.personajes;
public class Personaje{
	private String nombre;
	private int vida;
	private int valVida;

	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
		if (0 < this.vida && this.vida < 99){

		}else{
			this.vida = 3;
		}
	}
	public int obtenVida(){
		return vida;
	}
	public boolean addVida(){
		if (0 < vida && vida < 99){
			vida = vida + 1;
			return true;
		}else{
			return false;
		}
	}
	public boolean decVida(){
		if (0 < vida && vida < 99){
			vida = vida - 1;
			return true;
		}else{
			return false;
		}
	}
	public int addVida(int vida){
		if (this.vida + vida < 99){
			this.vida = this.vida + vida;
		}
		return this.vida;
	}
	public boolean decVida(int vida){
		if (0 < vida && vida < 99){
			valVida = this.vida - vida;
			if(0 < valVida && valVida < 99){
				this.vida = this.vida - vida;
			}else{
				return false;
			}
			return true;
		}else{
			return false;
		}
	}
	public String modificarNombre(String nombre){
		this.nombre = nombre;
		return this.nombre;
	}
	public String obtenerDetalle(){
		return "Nombre: " + nombre + " y Vida: " + vida;
	}
}