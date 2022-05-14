//hora de inicio: 7:52
//hora de finalizacion: 
package mx.tv.gameswinner.dragongame.personajes;
import mx.tv.gameswinner.dragongame.utilerias.*;
public class Girasol extends Planta{
	private int soles = 1;

	public Girasol(String nombre, int vida, Escudo escudo, int soles){
		super(nombre,vida,escudo);
		this.soles = soles;
	}
	public Girasol(String nombre, Escudo escudo, int soles){
		this(nombre,3,Escudo.NOPRO,soles);
	}
	public Girasol(String nombre, int vida, int soles){
		super(nombre, vida);
		this.soles = soles;
	}
	public Girasol(String nombre){
		super(nombre);
	}

	public int getSoles(){
		return soles;
	}
	public String toString(){
		return super.toString() + " Soles: " + getSoles();
	} 
	public boolean equals(Object o){
		if (!(o instanceof Girasol)) {
			return false;
		}
		Girasol gir = (Girasol) o;
		if ((nombre.equals(gir.nombre)) && (vida == gir.vida) && (regresaEscudo().equals(gir.regresaEscudo())) && (soles == gir.soles)){
			return true;
		}else {
			return false;
		}
	}
}