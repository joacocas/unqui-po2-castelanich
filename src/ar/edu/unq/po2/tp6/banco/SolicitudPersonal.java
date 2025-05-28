package ar.edu.unq.po2.tp6.banco;

public class SolicitudPersonal extends SolicitudDeCredito {
	
	public SolicitudPersonal(Cliente cl, double monto, int plazo) {
		this.clienteSolicita = cl;
		this.montoSolicitado = monto;
		this.plazoEnMeses = plazo;
	}

	public boolean esAceptable() {
		return (minimoDeIngresosAnuales() && limiteMontoCuota());
	}
	
	public boolean minimoDeIngresosAnuales() {
		return this.clienteSolicita.getSueldonNetoAnual() >= 15000.00;
	}
	
	public boolean limiteMontoCuota() {
		return this.clienteSolicita.getSueldoNetoMensual() * 0.70 > this.montoSolicitado;
	}
}