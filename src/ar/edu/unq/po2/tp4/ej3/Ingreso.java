package ar.edu.unq.po2.tp4.ej3;

public class Ingreso {
	
	private String mesDePercepcion;
	private String concepto;
	private double montoPercibido;
	
	public Ingreso(String mes, String concepto, double montoPercibido) {
		this.mesDePercepcion = mes;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public double getMontoPercibido() {
		return montoPercibido;
	}
	
	public double getMontoImponible() {
		return montoPercibido;
	}
	
	public String getMesDePercepcion() {
		return mesDePercepcion;
	}
	
	public String getConcepto() {
		return concepto;
	}
}
