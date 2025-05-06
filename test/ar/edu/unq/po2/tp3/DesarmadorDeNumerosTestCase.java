package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DesarmadorDeNumerosTestCase {
	private int[] numeros;
	
	@BeforeEach
	public void setUp() throws Exception {
		numeros = new int[]{182746, 27343, 326745, 23784672};
	}
	
	@Test
	void testContarDigitosParesDeUnNumero() {
		int numeroAProbar = 1278421;
		int cantidadEsperada = 4;
		int cantidadObtenida = DesarmadorDeNumeros.contadorDeDigitosPares(numeroAProbar);
		assertEquals(cantidadObtenida, cantidadEsperada);
	}
	
	@Test
	void testNumeroConMasDigitosPares() {
		int numeroEsperado = 23784672;
		int numeroObtenido = DesarmadorDeNumeros.numeroConMasDigitosPares(numeros);
		assertEquals(numeroEsperado, numeroObtenido);
	}
}