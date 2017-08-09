package com.utn.modelo;

public class Conductor {
	// Atributos
	public String nombre;
	public boolean licencia;
	public int edad;
	
	public void conducir(Auto a1) {
		System.out.println("El conductor "+ nombre + " esta conduciendo un auto marca: " + a1.marca);
	}
}
