//hora de inicio: 7:30
//hora de finalizacion: 10:25

public class PruebaFor{
	public static void main(String[] args) {
		for (int i = 2 ; i<11 ; i = i + 2) {
			System.out.println(i);
		}
		for ( int x = 1; x < 11 ; x++) {
			if (x%3 == 0) {
				System.out.println(x);
			}
		}
		for ( int y = 1; y < 11 ; y++) {
			if (y%4 == 0) {
				System.out.println(y);
			}
		}
	}
}