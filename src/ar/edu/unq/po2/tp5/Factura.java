package ar.edu.unq.po2.tp5;

public abstract class Factura implements Cobrable{
	
	public abstract double montoAPagar();
	
	public void registrarEnCaja(CajaDelMercadoCentral caja) {
		caja.sumarMonto(this.montoAPagar());
		caja.notificar(this);
	}	
}