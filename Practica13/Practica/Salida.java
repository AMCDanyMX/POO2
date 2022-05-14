import java.util.Scanner;
import java.io.*;
public class Salida {
	public static void main(final String[] args) {
		final Scanner teclado = new Scanner(System.in);
		String archivo;
		String[] datos = new String[100];
		int suma = 0;
		int num1 = 0;
		int num2 = 0;
		final String fileOut = "Salida.out";
		System.out.println("Dame El nombre de un archivo o un directorio");
		archivo = teclado.next();
		final File file = new File(archivo);
		if (!file.exists()) {
			System.out.println("No existe el archivo o directorio");
			System.exit(-1);
		}
		if (file.isDirectory()) {
			System.out.println("Es un directorio");
			System.exit(-1);
		}
		if (file.isFile()) {
			if (file.canRead()) {
				try{
					final BufferedWriter salida = new BufferedWriter(new FileWriter(fileOut));
					final BufferedReader in = new BufferedReader(new FileReader(file)); 
					String s;
					while((s = in.readLine()) !=null){
						datos = s.split(",");
						num1 = Integer.parseInt(datos[0]);
						num2 = Integer.parseInt(datos[1]);
						suma = num1 + num2;
						salida.write(suma + "\n");
					}
					in.close();
					salida.close();
				} catch (final FileNotFoundException e1) { 
					System.err.println("File not found: " + file);
				} catch (final IOException e2) { 
					e2.printStackTrace();
				}
			}
		}
	}
}