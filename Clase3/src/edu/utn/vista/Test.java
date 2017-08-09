package edu.utn.vista;

public class Test {

	public static void main(String[] args) {
		cargoDatos("Agustin",21,89.0,1.40);
	}

	
	public static void cargoDatos(String nombre, int edad, double peso, double altura) {
		System.out.print("Nombre " + nombre + ", ");
		calculoIMC(altura, peso);
	}
	
	
	// menor 18.5 estas flaco
	// entre 18.5 y 24.9 ( peso normal)
	// 25 a 29.9 sos un gordito feliz
	// 30 gordo obeso
	public static void calculoIMC(double altura, double peso) {

		double res = peso / (altura * altura);

		if (res <= 18.5) {
			System.out.println("Estas flaco empeza a comer!!!!");
		} else if (res > 18.5 && res <= 24.9) {
			System.out.println("Estas joya entrale al Mc");
		} else if (res >= 25 && res <= 29.9) {
			System.out.println("Gordito tene cuidado!!");
		} else {
			System.out.println("Gordito a punto de morir!!!");
		}

	}

}
