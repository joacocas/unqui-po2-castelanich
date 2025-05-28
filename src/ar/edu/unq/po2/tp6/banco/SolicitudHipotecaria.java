package ar.edu.unq.po2.tp6.banco;

public class SolicitudHipotecaria extends SolicitudDeCredito {
	
	private Propiedad propiedadGarantia;
	
	public SolicitudHipotecaria(Cliente cl, double monto, int plazo, Propiedad prop) {
		this.clienteSolicita = cl;
		this.montoSolicitado = monto;
		this.plazoEnMeses = plazo;
		this.propiedadGarantia = prop;
	}
	
	public Propiedad getPropiedad() {
		return this.propiedadGarantia;
	}
	
	public boolean esAceptable() {
		return (limiteMontoCuota() && limiteDeMontoPorGarantia() && limiteDeEdad());
	}
	
	public boolean limiteMontoCuota() {
		return this.clienteSolicita.getSueldoNetoMensual() * 0.50 > this.montoSolicitado / 12;
	}
	
	public boolean limiteDeMontoPorGarantia() {
		return this.montoSolicitado < this.propiedadGarantia.getValorFiscal();
	}
	
	public boolean limiteDeEdad() {
		int plazoEnAnios = this.plazoEnMeses / 12;
		int edadAlTerminoDelPlazo = this.clienteSolicita.getEdad() + plazoEnAnios;
		return edadAlTerminoDelPlazo <= 65;
	}
}