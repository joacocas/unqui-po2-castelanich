package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuadradoTestCase {

	@Test
	void testCrearCuadrado() {
		Punto esquinaSupIzqCuadrado = new Punto(2, 3);
		int lado1 = 4;
		Cuadrado c1 = new Cuadrado(esquinaSupIzqCuadrado, lado1);
		
		int medidaLadoEsperado = 4; 
		
		assertEquals(c1.getMedidaLado(), medidaLadoEsperado);
	}
	
	@Test
	void testCalcularMedidasDeEsquinaSuperiorDerecha() {
		Punto punto1 = new Punto(2, 3);
		int lado1 = 4;
		Cuadrado c1 = new Cuadrado(punto1, lado1);
		
		int xEsquinaSupDer = 6;
		int yEsquinaSupDer = 3;

		assertEquals(c1.getEsquinaSuperiorDerecha().getPuntoX(), xEsquinaSupDer);
		assertEquals(c1.getEsquinaSuperiorDerecha().getPuntoY(), yEsquinaSupDer);
	}
	
	@Test
	void testCalcularMedidasDeEsquinaInferiorDerecha() {
		Punto punto1 = new Punto(2, 3);
		int lado1 = 4;
		Cuadrado c1 = new Cuadrado(punto1, lado1);
		
		int xEsquinaInfDer = 6;
		int yEsquinaInfDer = -1;

		assertEquals(c1.getEsquinaInferiorDerecha().getPuntoX(), xEsquinaInfDer);
		assertEquals(c1.getEsquinaInferiorDerecha().getPuntoY(), yEsquinaInfDer);
	}
	
	@Test
	void testCalcularMedidasDeEsquinaInferiorIzquierda() {
		Punto punto1 = new Punto(2, 3);
		int lado1 = 4;
		Cuadrado c1 = new Cuadrado(punto1, lado1);
		
		int xEsquinaInfIzq = 2;
		int yEsquinaInfIzq = -1;

		assertEquals(c1.getEsquinaInferiorIzquierda().getPuntoX(), xEsquinaInfIzq);
		assertEquals(c1.getEsquinaInferiorIzquierda().getPuntoY(), yEsquinaInfIzq);
	}
	
	@Test
	void testCalcularPerimetro() {
		Punto punto1 = new Punto(2, 3);
		int lado1 = 4;
		Cuadrado c1 = new Cuadrado(punto1, lado1);
		
		int perimetroEsperado = 16;

		assertEquals(c1.calcularPerimetro(), perimetroEsperado);
	}
	
	@Test
	void testCalcularArea() {
		Punto punto1 = new Punto(2, 3);
		int lado1 = 4;
		Cuadrado c1 = new Cuadrado(punto1, lado1);
		
		int areaEsperada = 16;

		assertEquals(c1.calcularArea(), areaEsperada);
	}	

}
