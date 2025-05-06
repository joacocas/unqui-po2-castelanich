package ar.edu.unq.po2.tp4.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTestCase {
	
	private Producto arroz;
	private Producto vino;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9d, true);
		vino = new Producto("Vino", 55d);
	}
	
	@Test
	public void testConstructor() {
		 double precioEsperado = 18.9;
		 double precioEsperado2 = 55;
		
		assertEquals("Arroz", arroz.getNombre());
		assertEquals(precioEsperado, arroz.getPrecio());
		assertTrue(arroz.esPrecioCuidado());
		
		assertEquals("Vino", vino.getNombre());
		assertEquals(precioEsperado2, vino.getPrecio());
		assertFalse(vino.esPrecioCuidado());
	}
	
	@Test
	public void testAumentarPrecio() {
		double precioEsperado = 20.4;
		arroz.aumentarPrecio(1.5);
		assertEquals(precioEsperado, arroz.getPrecio());
	}
}