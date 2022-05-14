package mx.tv.gameswinner.dragongame.pruebas;
import mx.tv.gameswinner.dragongame.personajes.*;
import mx.tv.gameswinner.dragongame.utilerias.*;
public class PruebaGirasol{
	public static void main(String[] args) {
		int j;

		Planta pla01 = new Planta("Azazel", 10, Escudo.NOPRO);
		Planta pla02 = new Planta("Carlos", 50);
		Planta pla03 = new Planta("Elias", Escudo.PRO);
		Planta pla04 = new Planta("Elias", Escudo.PRO);
		Zombie zom01 = new Zombie("Estefania", 80, Ataque.LOW);
		Zombie zom02 = new Zombie("Karen", Ataque.MED);
		Zombie zom03 = new Zombie("Britany");
		Girasol gir01 = new Girasol("Girasol");
		Girasol gir02 = new Girasol("Girasol");

		Personaje[] personaje = new Personaje[9];
		personaje[0] = pla01;
		personaje[1] = pla02;
		personaje[2] = pla03;
		personaje[3] = pla04;
		personaje[4] = zom01;
		personaje[5] = zom02;
		personaje[6] = zom03;
		personaje[7] = gir01;
		personaje[8] = gir02;

		for (Personaje o1 : personaje) {
			for (Personaje o2 : personaje) {
				System.out.print(o1);
				System.out.println(o2);
				if (o1.equals(o2)) {
					System.out.println("Son Iguales ");
				}
				j=(int)(Math.random()*10);
				o1.decVida(j);
				System.out.print(o1);
				System.out.println(o2);
				System.out.println("---------------------------------------");
			}
		}
	}
}