public class PruebaPersonaje{
	public static void main(String[] args) {
		int aleatorio=(int)Math.floor(Math.random()*(10000-0+1)+(0));
		int n=(int)(Math.random()*10);
		int j;
		Personaje personaje = new Personaje("Halo",aleatorio);
		System.out.println(aleatorio);
		for(int i = 0;i<n;i++){
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
	}
}