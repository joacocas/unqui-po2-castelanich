package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTestCase {

	@Test
	void testCrearRectangulo() {
		Punto punto1 = new Punto(2,3);
		Punto punto2 = new Punto(8,7);
		
		int altoEsperado = 0;
		int anchoEsperado = 6;
		
		Rectangulo r1 = new Rectangulo(punto1, punto2);
		
		assertEquals(r1.getAncho(), anchoEsperado);
		assertEquals(r1.getAlto(), altoEsperado);
	}
	
	@Test
	void testCalculoDeArea() {
		Punto punto1 = new Punto(8,4);
		Punto punto2 = new Punto(10,2);
		
		Rectangulo r1 = new Rectangulo(punto1, punto2);
		
		int areaEsperada = 4;
		
		assertEquals(areaEsperada, r1.calcularArea());
	}
	
	@Test
	void testCalculoDePerimetro() {
		Punto punto1 = new Punto(8,4);
		Punto punto2 = new Punto(10,2);
		
		Rectangulo r1 = new Rectangulo(punto1, punto2);
		
		int areaEsperada = 4;
		
		assertEquals(areaEsperada, r1.calcularArea());
	}
	
	@Test
	void testEsHorizontal() {
		Punto punto1 = new Punto(8,5);
		Punto punto2 = new Punto(10,5);
		
		Rectangulo r1 = new Rectangulo(punto1, punto2);
		
		assertTrue(r1.esHorizontal());
	}
	
	@Test
	void testEsVertical() {
		Punto punto1 = new Punto(10,5);
		Punto punto2 = new Punto(10,2);
		
		Rectangulo r1 = new Rectangulo(punto1, punto2);
		
		assertTrue(r1.esVertical());
	}

}
