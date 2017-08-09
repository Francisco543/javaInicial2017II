package com.utn.modelo;
   
public class Auto {

	// atributos
	public String marca;
	public String modelo;
	public String color;

	public boolean encender() {
		System.out.println("Auto encendido");
		return true;
	}

	public void acelerar() {
		System.out.println("Estoy acelerando");
	}

}
