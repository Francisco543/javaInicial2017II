package com.utn.vista;

import com.utn.modelo.Auto;
import com.utn.modelo.Conductor;

public class Test {

	public static void main(String[] args) {
		Conductor c1 = new Conductor();
		Auto autito1 = new Auto();
		autito1.marca="Citroen";
		autito1.modelo="3cv";
		autito1.color="amarillo";
		c1.nombre="Jaime";
		c1.conducir(autito1);
	}

}
