package com.utn.vista;

import com.utn.modelo.Persona;

public class Test {

	public static void main(String[] args) {

		String nombre = "Carlos";
		// inicializar un vector se puede hacer de dos maneras

		// opcion 1 : inicializado en linia
		String[] nombres = { "Carlos", "Norma", "Magui", "Alejandro", "Rodrigo", "Nico" };

		// Opcion 2 : seria por medio de la inicializacion del vector
		String[] colores = new String[5];

		colores[0] = "rojo";
		colores[1] = "azul";
		colores[2] = "amarillo";
		colores[3] = "naranja";
		colores[4] = "verde"; // indice

		// mostramos por pantalla los valores de nombres y colores

		System.out.println("Escribo la logintu' de nombres " + nombres.length);
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);

		}
		System.out.println("Escribo la logintud de colores: " + colores.length);

		for (int i = 0; i < colores.length; i++) {
			// i = i +3;
			if (i < colores.length) {
				System.out.println(colores[i]);
			} else {
				System.out.println("no hay elementos para esta posicion " + i);
			}

		}

		int[] numeros = { 1, 2, 3, 4, 5, 6, 20, 30, 40, 50, 100 };

		for (int j = 0; j < numeros.length; j++) {

			if (numeros[j] >= 6 && numeros[j] < 100) {
				System.out.println(numeros[j]);
			}
		}

		Persona[] personas = new Persona[3];

		Persona p1 = new Persona();
		p1.nombre = "octavio";
		p1.apellido = "Vasquez";
		p1.edad = 26;

		personas[0] = p1;

		personas[1] = new Persona();

		personas[1].nombre = "Oliver";
		personas[1].apellido = "Klein";
		personas[1].edad = 24;

		personas[2] = new Persona();
		personas[2].nombre = "Omar";
		personas[2].apellido = "Sacardi";
		personas[2].edad = 43;

		for (int i = 0; i < personas.length; i++) {

			System.out.println("persona indice:" + i);
			System.out.println("nombre: " + personas[i].nombre);
			System.out.println("apellido: " + personas[i].apellido);
			System.out.println("edad: " + personas[i].edad);
			System.out.println("==========================");
		}

	}

}
