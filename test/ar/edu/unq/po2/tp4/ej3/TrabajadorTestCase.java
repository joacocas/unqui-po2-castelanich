package ar.edu.unq.po2.tp4.ej3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrabajadorTestCase {

	@Test
	public void testMontosDeIngresosDeTrabajador() {
		Trabajador t = new Trabajador();
	    t.agregarIngreso(new Ingreso("Octubre", "Sueldo", 100000));
	    t.agregarIngreso(new IngresoHorasExtra("Diciembre", "Horas extra", 20000, 5));

	    assertEquals(120000, t.getTotalPercibido());
	    assertEquals(100000, t.getMontoImponible());
	    assertEquals(2000, t.getImpuestoAPagar());
	}
}