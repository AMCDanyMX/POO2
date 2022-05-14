package com.nem.practicl13.pruebas;
import com.nem.practicl13.personas.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.TreeSet;
public class TestPractica13{
   public static void main(String[] args) {

      LinkedList<Persona> lista = new LinkedList<Persona>();
      TreeSet<Estudiante> estudiante = new TreeSet<Estudiante>();
      ArrayList<Apostador> apostador = new ArrayList<Apostador>();

      Comparator c = new OrderByName();
      Comparator c2 = new OrderByPunto();

      lista.add( new Estudiante("REYES JOSUE", "CABRERA", 25, 15450669, 95.0f));
      lista.add( new Estudiante("EMMANUEL", "CASTILLO", 22, 17450541, 72.0f));
      lista.add( new Estudiante("LUIS FERNANDO", "CORREA", 23, 17450543, 82.0f));
      lista.add( new Estudiante("ROSARIO", "LUNA", 23, 17450546, 74.0f));
      lista.add( new Estudiante("RICARDO", "ECHANIZ", 23, 17450547, 55.0f));
      lista.add( new Estudiante("JUAN PEDRO", "GAMBOA", 22, 17451014, 51.0f));
      lista.add( new Estudiante("JOSE DANIEL", "GONZALEZ", 24, 16450511, 80.0f));
      lista.add( new Estudiante("ALEJANDRA", "GONZALEZ", 19, 17450550, 54.0f));
      lista.add( new Estudiante("KEVIN ALEXIS", "GUERRERO", 24, 18450144, 62.0f));
      lista.add( new Estudiante("JOSUE", "MARTINEZ", 18, 17450558, 53.0f));
      lista.add( new Estudiante("FERNANDO", "MEDINA", 24, 17450559, 52.0f));
      lista.add( new Estudiante("MARTIN", "MONTOYA", 24, 16450917, 63.0f));
      lista.add( new Estudiante("ERICK ALEJANDRO", "ORTIZ", 24, 17450561, 68.0f));
      lista.add( new Estudiante("CARLOS MARCELO", "PALACIOS", 21, 17450563, 82.0f));
      lista.add( new Estudiante("MAGALY", "RAMIREZ", 22, 17450570, 66.0f));
      lista.add( new Estudiante("ALEJANDRO JOSUE", "ROJAS", 18, 16450542, 53.0f));
      lista.add( new Estudiante("YESENIA SELENE", "ROSALES", 17, 17450574, 65.0f));
      lista.add( new Estudiante("JORGE EDUARDO", "SAUCEDO", 25, 17450577, 64.0f));
      lista.add( new Estudiante("LUIS MANUEL", "SEGOVIA", 20, 17450578, 67.0f));
      lista.add( new Estudiante("EDGAR GERARDO", "SORIANO", 23, 16450546, 56.0f));
      lista.add( new Estudiante("GEMA LIZETH", "SOSA", 23, 17450579, 59.0f));
      lista.add( new Apostador("JUAN JOSE", "BASURTO", 89, 285675.0f, 77));
      lista.add( new Apostador("RICARDO ALBERTO", "BENAVIDES", 58, 494515.0f, 50));
      lista.add( new Apostador("CARLOS RAFAEL", "CONTRERAS", 78, 703655.0f, 73));
      lista.add( new Apostador("JOEL ADRIAN", "CRUZ", 60, 250059.0f, 58));
      lista.add( new Apostador("IRMA KARINA", "GARCIA", 25, 143612.0f, 82));
      lista.add( new Apostador("MIGUEL ANGEL", "LOPEZ", 81, 49238.0f, 100));
      lista.add( new Apostador("SALVADOR ERNESTO", "MOLINA", 89, 124553.0f, 85));
      lista.add( new Apostador("GUADALUPE RAQUEL", "MURILLO", 51, 433467.0f, 81));
      lista.add( new Apostador("JOSE ABRAHAM", "MUÑOZ", 46, 649309.0f, 86));
      lista.add( new Apostador("YAZMIN IRENE", "PAÑOL", 54, 106851.0f, 63));
      lista.add( new Apostador("MISSAEL", "PIZAÑA", 81, 307873.0f, 54));
      lista.add( new Apostador("GUSTAVO DANIEL", "RAMIREZ", 55, 722971.0f, 51));
      lista.add( new Apostador("KEVIN", "RAYGOZA", 60, 107195.0f, 66));
      lista.add( new Apostador("BRAYAN ALEXIS", "RODRIGUEZ", 30, 747749.0f, 51));
      lista.add( new Apostador("OSCAR", "SANTOS", 84, 634019.0f, 59));
      lista.add( new Apostador("ISMAEL DE JESUS", "TORRES", 83, 540552.0f, 92));

      for (Persona tmp : lista) {
            if (tmp instanceof Estudiante) {
                  estudiante.add((Estudiante)tmp);
            }

            if (tmp instanceof Apostador) {
                  apostador.add((Apostador)tmp);
            }
      }

      int n = 1;

      for (Estudiante tmp : estudiante) {
            System.out.println(n + " " + tmp);
            n++;
      }

      System.out.println("***************************************************");

      Collections.sort(apostador, c);

      for (Apostador tmp : apostador) {
            System.out.println(tmp);
      }

      System.out.println("***************************************************");

      for (Apostador tmp : apostador) {
            System.out.println(tmp);
      }

      System.out.println("***************************************************");

      Collections.sort(apostador, c2);

      for (Apostador tmp : apostador) {
            System.out.println(tmp);
      }
   }
}