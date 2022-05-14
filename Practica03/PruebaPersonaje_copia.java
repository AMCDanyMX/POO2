public class PruebaPersonaje_copia{
	public static void main(String[] args) {
		int aleatorio=(int)Math.floor(Math.random()*(1000-0+1)+(0));
		int n=(int)(Math.random()*10);
		int j;
		Personaje_copia personaje = new Personaje_copia("Halo",aleatorio);
		System.out.println(aleatorio);
		for(int i = 0;i<n;i++){
			System.out.println(personaje.obtenVida());
			j=(int)(Math.random()*100);
			if(personaje.addVida(j)){
				System.out.println("Incremento - Ahora la vida es de "+personaje.obtenVida());
				System.out.println(j);
			}else{
				System.out.println("No se puede agregar "+j+ " y "+personaje.obtenVida());
			}
			j=(int)(Math.random()*100);
			if(personaje.decVida(j)){
				System.out.println("Decremento - Ahora la vida es de "+personaje.obtenVida());
				System.out.println(j);
			}else{
				System.out.println("No se puede restar "+j+ " a "+personaje.obtenVida());
			}
		}
		System.out.println("Vida final " + personaje.obtenVida());
	}
}