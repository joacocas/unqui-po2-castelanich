package ar.edu.unq.po2.tp4.ej3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IngresoTestCase {

	@Test
	public void testIngresoMontoImponible() {
		Ingreso ingreso = new Ingreso("Mayo", "Sueldo", 200000);
		assertEquals(200000, ingreso.getMontoImponible());
	}
	
	@Test
	public void testIngresoMontoPercibido() {
		Ingreso ingreso = new Ingreso("Mayo", "Sueldo", 200000);
		assertEquals(200000, ingreso.getMontoPercibido());
	}

}