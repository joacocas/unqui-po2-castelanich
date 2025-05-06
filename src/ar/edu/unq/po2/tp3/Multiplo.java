package ar.edu.unq.po2.tp3;

public class Multiplo {
	
	public static int multiplosDe(int x, int y) {
		int numeroMasAlto = 1000;
		while (numeroMasAlto > 0) {
			if(numeroMasAlto % x == 0 && numeroMasAlto % y == 0) {
				return numeroMasAlto;
			}
			numeroMasAlto--;
		}
		return -1;
	}
}
