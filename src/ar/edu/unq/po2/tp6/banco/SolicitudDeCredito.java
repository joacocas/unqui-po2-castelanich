package ar.edu.unq.po2.tp6.banco;

public abstract class SolicitudDeCredito {
	
	protected Cliente clienteSolicita;
	protected double montoSolicitado;
	protected int plazoEnMeses;
	
	public double getMontoCuotaMensual() {
		return this.montoSolicitado / this.plazoEnMeses;
	}
	
	public double getMontoSolicitado() {
		return this.montoSolicitado;
	}
	
	public int getDniCliente() {
		return clienteSolicita.getDni();
	}
	
	public abstract boolean esAceptable();
}
