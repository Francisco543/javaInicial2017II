package edu.utn.controlador;

import edu.utn.modelo.Conductor;
import edu.utn.modelo.Vehiculo;

public class ViajeControlador {
	
	public void recorrido() {
		//Me creo el objeto del conductor
		
		Vehiculo v1 = new Vehiculo();
		
		v1.marca="Peugeot";
		v1.color="amarillo";
		v1.tarifa=30;
		System.out.println("El vehiculo " + v1.marca +  " de color "+ v1.color + " con tarifa : " + v1.tarifa + " va a cobrar!");
		v1.valorRecorrido(7.0);
		
		System.out.println("===================");
		
		//Objeto N1
		Conductor mrmagoo = new Conductor();
		mrmagoo.nombre="mr";
		mrmagoo.apellido="magoo";
		mrmagoo.edad=80;
		mrmagoo.conducir();
		System.out.println("Se le otorgo la licencia " + mrmagoo.tipoLicencia);
		
		//creo otro objeto del conductor
		//Objeto N2
		Conductor c1 = new Conductor();
		c1.nombre="magui";
		c1.edad=4;
		c1.conducir();
		System.out.println("Se le otorgo la licencia " + c1.tipoLicencia);
		
		System.out.println("========= TRABAJO CON EL METODO DEL CONDUCTOR ASIGNO VEHICULO ================");
		
		//new Vehiculo() o null
		Vehiculo vehi1 = c1.asignoVehiculo("taxi");
		
		//vehi1.marca = null.marca != inversa del == 
		// !=  quiere decir "es distinto de..."
		if(vehi1 != null) {
			System.out.println("Vehiculo marca "+ vehi1.marca + " color, " + vehi1.color + " su tarifa es "+ vehi1.tarifa);
		}else {
			System.out.println("La variable vehi1 es null y por eso no da resultados");
		}
		
		
		//Ejemplo
//		//Caso N1
//		Vehiculo v1 = new Vehiculo();
//		
//		//Caso N2
//		Vehiculo v2 = null;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
