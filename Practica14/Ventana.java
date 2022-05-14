import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Ventana {
	private int pal = 0;
	private int let = 0;
	private int num = 0;
	private int otro = 0;
	private JFrame fVentana;
	private JTextArea txtAContenido;
	private JTextField txtFPalabras, txtFLetras, txtFNumeros, txtFOtros;
	private JLabel lblPalabras, lblLetras, lblNumeros, lblOtros;
	private JButton btnAbrir;
	private String contenido;
	private String[] pala;

	public Ventana() {

		fVentana = new JFrame("Practica 14");
		fVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		txtAContenido = new JTextArea();
		txtAContenido.setText("Aqui va el contenido del archivo");
		txtFPalabras = new JTextField(5);
		txtFLetras = new JTextField(5);
		txtFNumeros = new JTextField(5);
		txtFOtros = new JTextField(5);
		lblPalabras = new JLabel("Palabras:");
		lblLetras = new JLabel("Letras:");
		lblNumeros = new JLabel("Numeros:");
		lblOtros = new JLabel("Otros:");
		btnAbrir = new JButton("Abrir Archivo");

		fVentana.setLayout(new FlowLayout()); 
		fVentana.add(txtAContenido);
		fVentana.add(btnAbrir);
		fVentana.add(lblPalabras);
		fVentana.add(txtFPalabras); 
		fVentana.add(lblLetras); 
		fVentana.add(txtFLetras);
		fVentana.add(lblNumeros);
		fVentana.add(txtFNumeros);
		fVentana.add(lblOtros);
		fVentana.add(txtFOtros);

		txtFPalabras.setText("" + pal);
		txtFLetras.setText("" + let);
		txtFNumeros.setText("" + num);
		txtFOtros.setText("" + otro);

		fVentana.setSize(1200,900); 
		fVentana.setVisible(true);

		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				openFile();
			}
		});
	}

	public void openFile() {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Texto", "txt");
		chooser.setFileFilter(filter);
		int selection = chooser.showOpenDialog(fVentana);
		if (selection == JFileChooser.APPROVE_OPTION) {
			String archivo = chooser.getSelectedFile().getAbsolutePath();
			readFile(archivo);
		} else { 
			JOptionPane.showMessageDialog(fVentana,"Cancel or error");
		}
	}

	public void readFile(String ruta) {
		try {
			FileReader f = new FileReader(ruta);
			BufferedReader bf = new BufferedReader(f);
			String linea = bf.readLine();
			txtAContenido.setText("");
			while (linea != null) {
				txtAContenido.append(linea + "\n");
				linea = bf.readLine();
			}
			contenido = txtAContenido.getText();
			count(contenido);
		} catch (FileNotFoundException fnfe) {
			JOptionPane.showMessageDialog(fVentana,fnfe);
		} catch (IOException ioe) {
			JOptionPane.showMessageDialog(fVentana,ioe);
		}
	}

	public void count(String texto) {
		for (int x = 0;x < texto.length() ;x++) {
			if (Character.isDigit(texto.charAt(x))) {
			 	num++;
			}
			if (Character.isLetter(texto.charAt(x))) {
				let++;
			}else {
				otro++;
			}
		}
		pala = texto.split(" ");
		pal = pala.length;
		txtFPalabras.setText("" + pal);
		txtFLetras.setText("" + let);
		txtFNumeros.setText("" + num);
		txtFOtros.setText("" + otro);
	}

	public static void main(String[] args) {
		Ventana v = new Ventana();
	}
}