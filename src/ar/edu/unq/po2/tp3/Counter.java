package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> numbers;
	
	public Counter() {
		numbers = new ArrayList<Integer>();
	}
	
	public void addNumber(int number) {
		numbers.add(number);
	}
	
	public int cantidadDePares() {
		int count = 0;
		for (int num : numbers) {
			if (num % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public int cantidadDeImpares() {
		int count = 0;
		for (int num : numbers) {
			if (num % 2 != 0) {
				count++;
			}
		}
		return count;
	}
	
	public int cantidadDeMultiplosDe(int numero) {
		int count = 0;
		for (int num : numbers) {
			if (num % numero == 0) {
				count++;
			}
		}
		return count;
	}
}
