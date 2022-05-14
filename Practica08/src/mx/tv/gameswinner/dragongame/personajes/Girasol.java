//hora de inicio: 7:44
//hora de finalizacion: 9:57
package mx.tv.gameswinner.dragongame.personajes;
public class Girasol extends Planta{
	private int soles = 1;

	public Girasol(String nombre, int vida, String escudo, int soles){
		super(nombre,vida,escudo);
		this.soles = soles;
	}
	public Girasol(String nombre, String escudo, int soles){
		super(nombre, escudo);
		this.soles = soles;
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
		if ((obtenNombre().equals(gir.obtenNombre())) && (obtenVida() == gir.obtenVida()) && (regresaEscudo().equals(gir.regresaEscudo())) && (soles == gir.soles)){
			return true;
		}else {
			return false;
		}
	}
}