package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testChoferTaxi {

	@Test
	public void test1() {
		Taxi miTaxi = new Taxi ("Juan", "1Enero1970", 1234);
		assertEquals("Juan", miTaxi.getMiChofer().getNombre());
		
		//revisar errores en las otras clases
	}
	
	@Test
	public void test2(){
		//Taxi miTaxi2 = new Taxi("Juan", "1Enero1970", 1234);
		Taxi miTaxi2 = new Taxi(null, null, null);
		Chofer miChofer2 = new Chofer("Pepe", "1Enero1970", 5478);
		miTaxi2.setMiChofer(miChofer2); //le piso los datos al objeto taxi, HAGO que miTaxi2 apunte a miChofer2
		assertEquals("Pepe", miTaxi2.getMiChofer().getNombre());
	}

}
