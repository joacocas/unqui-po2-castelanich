package ar.edu.unq.po2.tp6.banco;

public class Propiedad {
	
	private String descripcion;
	private String direccion;
	private double valorFiscal;
	
	public Propiedad(String desc, String dir, double valor) {
		this.descripcion = desc;
		this.direccion = dir;
		this.valorFiscal = valor;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public double getValorFiscal() {
		return this.valorFiscal;
	}
}
