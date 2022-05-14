//hora de inicio: 7:43
//hora de finalizacion: 10:11
public class Personaje_copia{
	private String nombre;
	private int vida = 3;

	public Personaje_copia(String nombre, int vida){
		this.nombre = nombre;
		if (vida > 0 && vida < 100){
			this.vida = vida;
		}
	}
	public int obtenVida(){
		return vida;
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
}