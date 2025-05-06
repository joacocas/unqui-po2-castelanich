package ar.edu.unq.po2.tp4.ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoPrimeraNecesidadTestCase {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
	}
	
	@Test
	public void testCalcularPrecio() {
		double precioEsperado = 7.2;
		assertEquals(precioEsperado, leche.getPrecio());
	}
}