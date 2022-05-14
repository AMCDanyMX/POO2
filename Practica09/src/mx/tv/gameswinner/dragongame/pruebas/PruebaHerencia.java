package mx.tv.gameswinner.dragongame.pruebas;
import mx.tv.gameswinner.dragongame.personajes.*;
import mx.tv.gameswinner.dragongame.utilerias.*;
public class PruebaHerencia{
	public static void main(String[] args) {
		int j;

		Planta plan01 = new Planta("Azazel", 10, Escudo.NOPRO);
		Planta plan02 = new Planta("Carlos", 50);
		Planta plan03 = new Planta("Cristian", Escudo.PRO);
		Planta plan04 = new Planta("Elias");
		Zombie zom01 = new Zombie("Estefania", 80, Ataque.LOW);
		Zombie zom02 = new Zombie("Karen", Ataque.HI);
		Zombie zom03 = new Zombie("Britany");

		Personaje[] personaje = new Personaje[7];
		personaje[0] = plan01;
		personaje[1] = plan02;
		personaje[2] = plan03;
		personaje[3] = plan03;
		personaje[4] = zom01;
		personaje[5] = zom02;
		personaje[6] = zom03;

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