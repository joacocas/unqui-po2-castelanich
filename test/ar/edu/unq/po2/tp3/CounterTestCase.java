package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(2);
		counter.addNumber(4);
	}
	
	@Test
	public void testCantidadDePares() {
		int cantidad = 2;
		
		int cantidadObtenida = counter.cantidadDePares();
		assertEquals(cantidad, cantidadObtenida);
	}
	
	@Test
	public void testCantidadDeImpares() {
		int cantidad2 = 8;
		
		int cantidadObtenida2 = counter.cantidadDeImpares();
		assertEquals(cantidad2, cantidadObtenida2);
	}
	
	@Test
	public void testCantidadDeMultiplos() {
		int cantidad3 = 2;
		
		int cantidadObtenida3 = counter.cantidadDeMultiplosDe(3);
		assertEquals(cantidad3, cantidadObtenida3);
	}

}
