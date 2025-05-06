package ar.edu.unq.po2.tp4.ej3;

public class IngresoHorasExtra extends Ingreso{

	private int cantidadHorasExtra;
	
	public IngresoHorasExtra(String mes, String concepto, double montoPercibido, int horasExtra) {
		super(mes, concepto, montoPercibido);
		this.cantidadHorasExtra = horasExtra;
	}
	
	public int getCantidadHorasExtra() {
		return cantidadHorasExtra;
	}
	
	@Override
	public double getMontoImponible() {
		return 0.0;
	}
}
