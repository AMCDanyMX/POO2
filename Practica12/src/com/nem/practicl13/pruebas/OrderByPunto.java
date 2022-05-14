package com.nem.practicl13.pruebas;
import com.nem.practicl13.personas.Apostador;
import java.util.Comparator;
public class OrderByPunto implements Comparator<Apostador> {
	public  int compare(Apostador o1, Apostador o2) {
		return o2.getPunto() - o1.getPunto();
	}
}