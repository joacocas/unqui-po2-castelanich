package ar.edu.unq.po2.tp4.ej3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IngresoHorasExtraTestCase {

	@Test
	public void testMontoImponible() {
		IngresoHorasExtra ingreso = new IngresoHorasExtra("Julio", "Horas extras", 1500, 10);
		assertEquals(0, ingreso.getMontoImponible());
	}
}