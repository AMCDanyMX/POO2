//hora de inicio: 7:30
//hora de finalizacion: 8:28

public class PruebaCiclos{
	public static void main(String[] args) {
		int a = 1;
		int b = 1;  
		for (int i = 1 ; i < 11 ; i++ ) {
			System.out.println(i);
		}
		while (a < 11) {
			System.out.println(a);
			a++;
		}
		do{
			System.out.println(b);
			b++;
		}while(b < 11);
	}
}