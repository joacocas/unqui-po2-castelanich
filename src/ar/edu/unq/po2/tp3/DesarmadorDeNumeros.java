package ar.edu.unq.po2.tp3;

public class DesarmadorDeNumeros {
	
	//Funcion para contar la cantidad de digitos pares de un numero
	public static int contadorDeDigitosPares(int numero) {
		int contador = 0;
		numero = Math.abs(numero);
		
		while(numero > 0) {
			int digito = numero % 10;
			if(digito % 2 == 0) {
				contador++;
			}
			numero = numero / 10;
		}
		return contador;
	}
	
	public static int numeroConMasDigitosPares(int[] arreglo) {
		int maxCantidad = -1;
		int resultado = 0;
		
		for(int num : arreglo) {
			int cantidadDePares = contadorDeDigitosPares(num);
			if(cantidadDePares > maxCantidad) {
				resultado = num;
				maxCantidad = cantidadDePares;
			}
		}
		return resultado;
	}
}
