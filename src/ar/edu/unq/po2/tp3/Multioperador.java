package ar.edu.unq.po2.tp3;

public class Multioperador {
	
	public static int sumadorDeArreglos(int[] arreglo) {
		int sumaTotal = 0;
		
		for(int num : arreglo) {
			sumaTotal += num;
		}
		return sumaTotal;
	}
	
	public static int restadorDeArreglos(int[] arreglo) {
		if(arreglo == null || arreglo.length == 0) {
			throw new IllegalArgumentException("El arreglo no puede ser nulo o vacio");
		}
		
		int restaTotal = arreglo[0];
		
		for(int i = 1; arreglo.length > i; i++) { 
			restaTotal -= arreglo[i];
		}
		return restaTotal;
	}
	
	public static int multiplicadorDeArreglos(int[] arreglo) {
		int multiplicadorTotal = 1;
		
		for(int num : arreglo) {
			multiplicadorTotal *= num;
		}
		return multiplicadorTotal;
	}
}
