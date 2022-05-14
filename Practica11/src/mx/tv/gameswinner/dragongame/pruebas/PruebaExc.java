package mx.tv.gameswinner.dragongame.pruebas;
import mx.tv.gameswinner.dragongame.personajes.*;
import mx.tv.gameswinner.dragongame.utilerias.*;
import java.util.Random;
public class PruebaExc {
	public static void main(String[] args) {

		Random r = new Random();
		int num;

		Personaje pla01 = new Planta("Azazel", 10, Escudo.NOPRO);
		Personaje zom01 = new Zombie("Estefania", 80, Ataque.LOW);
		Personaje gir01 = new Girasol("Girasol");

		Personaje[] personaje = new Personaje[3];
		personaje[0] = pla01;
		personaje[1] = zom01;
		personaje[2] = gir01;

		for (Personaje tmp : personaje) {
			System.out.println(tmp);
			try {
				num=(int)(r.nextDouble() * 200 + -100);
				tmp.addVida(num);
			}catch (AddErrores e) {
				System.out.println("Error: " + e.getMsg() + " numero erroneo: " + e.getNum());
			}
		}
	}
}