package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
	
	private double costoPorUnidadConsumida;
	private int cantidadDeUnidadesConsumidas;
	
	public Servicio(double costoUnidad, int cantUnidades) {
		this.cantidadDeUnidadesConsumidas = cantUnidades;
		this.costoPorUnidadConsumida = costoUnidad;
	}
	
	@Override
	public double montoAPagar() {
		return this.costoPorUnidadConsumida * this.cantidadDeUnidadesConsumidas;
	}
}
