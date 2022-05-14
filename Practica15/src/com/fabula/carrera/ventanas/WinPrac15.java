package com.fabula.carrera.ventanas;
import com.fabula.carrera.Hilos.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class WinPrac15 extends JFrame {
	JLabel tortuga, libre;
	JButton start;

	public WinPrac15(String titulo) {
		super(titulo);
		this.initComponents();
	}

	public void initComponents() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tortuga = new JLabel("");
		libre = new JLabel("");
		start = new JButton("Inicio");
		this.add(tortuga, BorderLayout.NORTH);
		this.add(libre, BorderLayout.SOUTH);
		this.add(start, BorderLayout.CENTER);
		this.setSize(800,100);

		start.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				iniciarCarrera();
			}
		});
	}

	public void iniciarCarrera() {
		tortuga.setText("X");
		libre.setText("0");

		Hilo h1 = new Hilo("Hilo 1", Thread.MAX_PRIORITY, tortuga, 'X');
		Hilo h2 = new Hilo("Hilo 2", Thread.MAX_PRIORITY, libre, '0');
		h1.start();
		h2.start();
	}
}