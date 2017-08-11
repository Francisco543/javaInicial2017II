package edu.utn.modelo;

public class Vehiculo {

	// atributos
	public String marca;
	public String color;
	public String tipo;
	public int tarifa;

	// metodos
	public void valorRecorrido(double kmRecorridos) {

		if (kmRecorridos <= 5.0) {
			System.out.println("Se le cobrara : " + (kmRecorridos * tarifa));
		} else if (kmRecorridos <= 10.0) {
			System.out.println("Se le cobrara : " + ((kmRecorridos * tarifa) * 1.1));
		} else {
			System.out.println("Se le cobrara : " + ((kmRecorridos * tarifa) * 1.2));
		}
	}
}
