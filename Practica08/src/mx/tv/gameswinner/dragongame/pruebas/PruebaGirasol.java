package mx.tv.gameswinner.dragongame.pruebas;
import mx.tv.gameswinner.dragongame.personajes.*;
public class PruebaGirasol{
	public static void main(String[] args) {
		int j;

		Personaje per01 = new Personaje("Adolfo", 99);
		Personaje per02 = new Personaje("Alexis");
		Planta pla01 = new Planta("Azazel", 10, "B");
		Planta pla02 = new Planta("Carlos", 50);
		Planta pla03 = new Planta("Elias", "C");
		Planta pla04 = new Planta("Elias", "C");
		Zombie zom01 = new Zombie("Estefania", 80, false);
		Zombie zom02 = new Zombie("Karen", true);
		Zombie zom03 = new Zombie("Britany");
		Girasol gir01 = new Girasol("Girasol");
		Girasol gir02 = new Girasol("Girasol");

		Personaje[] personaje = new Personaje[11];
		personaje[0] = per01;
		personaje[1] = per02;
		personaje[2] = pla01;
		personaje[3] = pla02;
		personaje[4] = pla03;
		personaje[5] = pla04;
		personaje[6] = zom01;
		personaje[7] = zom02;
		personaje[8] = zom03;
		personaje[9] = gir01;
		personaje[10] = gir02;

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