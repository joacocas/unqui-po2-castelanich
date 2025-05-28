package ar.edu.unq.po2.tpcomposite.ej2;

public class Cultivo implements PorcionDeTierra {
	
	private String nombre;
	private double valorAnual;
	
	public Cultivo(String nombre, double valor) {
		this.nombre = nombre;
		this.valorAnual = valor;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getValorAnual() {
		return this.valorAnual;
	}

	@Override
	public double calcularGanancia() {
		return this.getValorAnual();
	}
}