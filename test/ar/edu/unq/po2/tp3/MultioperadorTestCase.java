package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MultioperadorTestCase {
	
	private int[] arreglo1;
	
	@BeforeEach
	public void setUp() {
		arreglo1 = new int[]{10, 2, 4, 3, 9, 5};
	}
	
	@Test
	public void sumadorDeArreglosTest() {
		int sumaTotal1 = 33;
		int sumaTotal2 = Multioperador.sumadorDeArreglos(arreglo1);
		assertEquals(sumaTotal1, sumaTotal2);
	}
	
	@Test
	public void restadorDeArreglosTest() {
		int restaTotal1 = -13;
		int restaTotal2 = Multioperador.restadorDeArreglos(arreglo1);
		assertEquals(restaTotal1, restaTotal2);
	}
	
	@Test
	public void multiplicadorDeArreglosTest() {
		int multipTotal1 = 10800;
		int multipTotal2 = Multioperador.multiplicadorDeArreglos(arreglo1);
		assertEquals(multipTotal1, multipTotal2);
	}

}
