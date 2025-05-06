package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PuntoTestCase {
	
	@Test
	void testCreacionEnOrigen() {
		int xEsperada = 0;
		int yEsperada = 0;
		
		Punto punto1 = new Punto();
		assertEquals(xEsperada, punto1.getPuntoX());
		assertEquals(yEsperada, punto1.getPuntoY());
	}
	
	@Test
	void testCreacionDePuntoConCoordoneadas() {
		int xEsperada = 3;
		int yEsperada = 5;
		
		Punto punto2 = new Punto(xEsperada, yEsperada);
		assertEquals(xEsperada, punto2.getPuntoX());
		assertEquals(yEsperada, punto2.getPuntoY());
	}
	
	@Test
	void testMoverPosicionDePunto() {
		int xEsperada = 3;
		int yEsperada = 5;
		Punto punto3 = new Punto();
		
		punto3.moverPuntoAPosicion(xEsperada, yEsperada);
		assertEquals(xEsperada, punto3.getPuntoX());
		assertEquals(yEsperada, punto3.getPuntoY());
	}
	
	@Test
	void testPuntoSumadoAOtroPunto() {
		Punto punto4 = new Punto(2, 8);
		Punto punto5 = new Punto(4, 2);
		
		int sumaXEsperada = 2 + 4;
		int sumaYEsperada = 8 + 2;
		
		Punto puntoResultante = punto4.puntoDeSumarOtroPunto(punto5);
		assertEquals(sumaXEsperada, puntoResultante.getPuntoX());
		assertEquals(sumaYEsperada, puntoResultante.getPuntoY());
	}
	
	
	
	

}
