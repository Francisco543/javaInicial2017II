package com.utn.modelo;

public class Persona {

	public String nombre;
	public String apellido;
	public int edad;

	public void comunicarse(String idioma) {
		if (idioma == "es") {
			System.out.println("Hola");
		} else if (idioma == "en") {
			System.out.println("hello");
		} else {
			System.out.println("mi reprobar aspañol eso ser amposible");
		}
	}
	
	public double cantComidaConsumida(String[] comidas) {
		
		return 1;
	}
}
