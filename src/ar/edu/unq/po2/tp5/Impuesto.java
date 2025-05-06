package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	
	private double tasaServicio;
	
	public Impuesto(double tasaServicio) {
		this.tasaServicio = tasaServicio;
	}
	
	@Override
	public double montoAPagar() {
		return this.tasaServicio;
	}
	
}
