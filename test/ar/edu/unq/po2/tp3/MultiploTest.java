package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiploTest {
	
	int numeroX = 3;
	int numeroY = 9; 
	
	@Test
	public void multiploTest() {
		int numeroMasAlto = Multiplo.multiplosDe(numeroX, numeroY);
		assertEquals(999, numeroMasAlto);
	}

}
