import java.util.Scanner;
import java.io.*;
public class Entrada {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String archivo = null;
		int n;
		int num;
		int num2;
		System.out.println("Teclea el nombre de un archivo o un directorio");
		archivo = teclado.next();
		File file = new File(archivo);
		if (!file.exists()) {
			System.out.println("No existe el archivo o directorio");
			try {
				System.out.println("Creando archivo... " + file);
				file.createNewFile();
				n = teclado.nextInt();
				try{
					BufferedWriter out = new BufferedWriter(new FileWriter(file));
					for (int x = 0;x < n;x++) {
						num=(int)(Math.random()*100);
						num2=(int)(Math.random()*100);
						out.write(num + "," + num2 + "\n");
					}
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}catch (IOException e2) {
				e2.printStackTrace();
			}
			System.exit(-1); 
		}
		if (file.isFile()) {
			System.out.println("es archivo");
			if (file.canRead()) {
				System.out.println("Se puede leer el archivo");
			}
			if (file.canWrite()) {
				System.out.println("Se puede escribir en el archivo");
			}
			System.out.println("Tamaño del archivo: " + file.length() + " bytes");
			n = teclado.nextInt();
			try{
				BufferedWriter out = new BufferedWriter(new FileWriter(file));
				for (int x = 0;x < n;x++) {
					num=(int)(Math.random()*100);
					num2=(int)(Math.random()*100);
					out.write(num + "," + num2 + "\n");
				}
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.exit(-1); 
		} else if (file.isDirectory()) {
			System.out.println("es directorio");
			String[] contenido = file.list();
			for (int i = 0;i < contenido.length;i++) {
				System.out.println(contenido[i]);
			}
		}
	}
}