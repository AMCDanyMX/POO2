package com.fabula.carrera.Hilos;
import javax.swing.*;
public class Hilo extends Thread {
	String nombre;
	JLabel label;
	char letra;
	int espera;

	public Hilo(String nombre, int prioridad, JLabel etiqueta, char letra) {
		this.nombre = nombre;
		super.setPriority(prioridad);
		this.label = etiqueta;
		this.letra = letra;
	}

	public void run() {
		String txtAnterior = "";
		for (int x = 0 ; x < 50 ; x++ ) {
			txtAnterior = label.getText();
			label.setText(txtAnterior);
			espera = (int)(Math.random()*1000);
			label.setText(txtAnterior + letra);
			//txtAnterior += letra;
			try{
				Thread.sleep(espera);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		label.setText(txtAnterior + "Fin");
	}
}