//hora de inicio: 7:30
//hora de finalizacion: 9:53

public class TablasMult{
	public static void main(String[] args) {
		mult:
		for ( int i = 2 ; i <= 5 ; i++ ) {
			for ( int x = 1 ; x <= 10 ; x++ ) {
				if (x >= i + 1){
					continue mult;
				}
				System.out.println(i + " x " + x + " = " + i * x);
			}
		}
	}
}