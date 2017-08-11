package edu.utn.modelo;

public class Pasajero {

	public String nombre;
	public String destino;
	public double dinero;

	public void pagar(double valorviaje) {
		System.out.println("voy a pagar " + valorviaje);
		
		//reutilizo la variable dinero para calcular cuando dinero debo pagar
		//y cuanto dinero me queda
		dinero = dinero - valorviaje;
		
		System.out.println("Mi dinero restante es " + dinero);
		
	}
}
