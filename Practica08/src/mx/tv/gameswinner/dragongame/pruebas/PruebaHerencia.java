package mx.tv.gameswinner.dragongame.pruebas;
import mx.tv.gameswinner.dragongame.personajes.*;
public class PruebaHerencia{
	public static void main(String[] args) {
		int j;
		Personaje per01 = new Personaje("Adolfo", 99);
		Personaje per02 = new Personaje("Alexis");
		Planta plan01 = new Planta("Azazel", 10, "B");
		Planta plan02 = new Planta("Carlos", 50);
		Planta plan03 = new Planta("Cristian", "C");
		Planta plan04 = new Planta("Elias");
		Zombie zom01 = new Zombie("Estefania", 80, false);
		Zombie zom02 = new Zombie("Karen", true);
		Zombie zom03 = new Zombie("Britany");

		Personaje[] personaje = new Personaje[9];
		personaje[0] = per01;
		personaje[1] = per02;
		personaje[2] = plan01;
		personaje[3] = plan02;
		personaje[4] = plan03;
		personaje[5] = plan04;
		personaje[6] = zom01;
		personaje[7] = zom02;
		personaje[8] = zom03;

		for (Personaje p : personaje) {
			System.out.println(p.obtenerDetalles());
			j=(int)(Math.random()*10);
			p.decVida(j);
			if (p instanceof Planta) {
				System.out.println("Soy Planta " + ((Planta)p).regresaEscudo());

			}
			if (p instanceof Zombie) {
				System.out.println("Soy Zombie " + ((Zombie)p).regresaAtaque());
			}
			System.out.println(p.obtenerDetalles());

		}
	}
}