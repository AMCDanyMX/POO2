package mx.tv.gameswinner.dragongame.pruebas;
import mx.tv.gameswinner.dragongame.personajes.*;
public class PruebaPersonaje{
	public static void main(String[] args) {
		/*
		int aleatorio=(int)Math.floor(Math.random()*(10000-0+1)+(0));
		int n=(int)(Math.random()*10);
		*/
		int j;
		/*
		Personaje personaje = new Personaje("Halo",aleatorio);
		*/
		Personaje per01 = new Personaje("Adolfo",100);
		Personaje per02 = new Personaje("Alexis",10);
		Personaje per03 = new Personaje("Azael",1);
		Personaje per04 = new Personaje("Carlos",0);
		Personaje per05 = new Personaje("Cristian",5);
		/*
		System.out.println(aleatorio);
		for(int i = 0;i < n;i++){
			System.out.println(personaje.obtenVida());
			j=(int)(Math.random()*10000);
			if(personaje.addVida(j) == true){
				System.out.println("Incremento - Ahora la vida es de "+personaje.obtenVida());
				System.out.println(j);
			}else{
				System.out.println("No se puede agregar "+j+ " y "+personaje.obtenVida());
			}
			j=(int)(Math.random()*10000);
			if(personaje.decVida(j) == true){
				System.out.println("Decremento - Ahora la vida es de "+personaje.obtenVida());
				System.out.println(j);
			}else{
				System.out.println("No se puede restar "+j+ " a "+personaje.obtenVida());
			}
		}
		System.out.println(personaje.obtenVida());
		*/
		System.out.println(per01.obtenerDetalle());
		System.out.println(per02.obtenerDetalle());
		System.out.println(per03.obtenerDetalle());
		System.out.println(per04.obtenerDetalle());
		System.out.println(per05.obtenerDetalle());

		Personaje per06 = per05;
		Personaje per07 = per04;
		Personaje per08 = per03;
		Personaje per09 = per02;
		Personaje per10 = per01;

		per06.modificarNombre("Emmanuel");
		per08.modificarNombre("Fany");
		per10.modificarNombre("Kevin");

		j=(int)(Math.random()*10000);
		per07.addVida(j);
		j=(int)(Math.random()*10000);
		per09.addVida(j);

		System.out.println(per06.obtenerDetalle());
		System.out.println(per07.obtenerDetalle());
		System.out.println(per08.obtenerDetalle());
		System.out.println(per09.obtenerDetalle());
		System.out.println(per10.obtenerDetalle());

		/*
		En esta practica utilisamos el paso por refecerencia para 
		poder modificar el nombre o la vida del personaje segun 
		lo que se pedia puesto que le damos un contenido al inicio
		para luego modificarlo y que la accion se reconosca, pero no 
		usamos el paso por valor puesto que no mandamos un contenido 
		para que el metodo realise algo pero sin devolver nada  
		*/
	}
}