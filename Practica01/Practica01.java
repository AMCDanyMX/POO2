//hora de inicio: 8:32
//hora de finalizacion:9:13

//{paquetes}?
//package com.duckysoft.miproyecto.principal;
//{importados}*
//import com.duckysoft.miproyecto.acciones.*;
//import com.duckysoft.miproyecto.vista.Ventana;
//definicion de clase{
public class Practica01{
	//sentencias
	//public class Practica01 extends Parent implements Interface{}
	//{atributos}*
	public float presupuesto;
	protected boolean activo;
	public String name;
	static int color = 5;
	//{constructor}*//si no se escribe se crea uno por defecto
	public Practica01(){
		//sentencias
	}
	//{metodo de ejecucion principal}?
	public static void main(String[] args) {
		//sentencias
		saludarYa();
		int colorDoble = getColorDoble(color);
		System.out.println(colorDoble);
	}
	//{metodos}*
	public static int getColorDoble(int x){
		return x*2;
	}
	public static void saludarYa(){
		System.out.println("Hola mundo");
	}
}//}fin de definicion de la clase