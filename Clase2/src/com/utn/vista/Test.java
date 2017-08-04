package com.utn.vista;

public class Test {
	static String nombre = "Mariano";

	public static void main(String[] args) {
		// invoco o llamo al procedimiento saludar()
		saludar();
		// creo dos varialbles de tipo enteros
		int numero1 = 4;
		sumoDosNumeros(numero1, 8);

		// invoco al metodo datosPersonales
		// boolean = true o false
		datosPersonales("Dante", 35, true);
		
		System.out.println("==========FUNCIONES============");
		
		
		//Opcion1
		int age = calculoEdad(1982);
		System.out.println("Su edad es: " + age);

		//Opcion2: directamente invoco a la funcion en mi System.out.println
		System.out.println(bienvenida());
		
		
	}

	// creo procedimiento que salude
	public static void saludar() {
		// variable de forma local
		// String nombre //descomentar si quieren utilizarlo de forma local

		System.out.println("Hola " + nombre);

	}

	// suma de numeros
	// Cuando trabajan con parametros verifican el orden,el tipo y cantidad
	// EJ: String, int, boolean
	public static void sumoDosNumeros(int n1, int nm2) {
		System.out.println("El resultado es: " + (n1 + nm2));
	}

	// procedimiento de datos personales
	public static void datosPersonales(String nombre, 
			int edad, 
			boolean fuma) {
		System.out.println("Su nombre es: " + nombre);
		System.out.println("Su edad es: " + edad);
		System.out.println("Fuma: " + fuma);
		return; //opcional no hace falta ponerlo
	}

	
	//funcion que retorna un valor de tipo candena ( String)
	public static String bienvenida() {
		
		return "Bienvenid@s a la aplicacion";
	}
	
	//funcion que retorna un numero entero
	public static int calculoEdad(int annoNacimiento) {
		int resultado = 2017 - annoNacimiento;
		
		return resultado;
	}
	
}







