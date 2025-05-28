package ar.edu.unq.po2.templateyadapter.ej2;

public class DePlanta extends Empleado{
	
	private double sueldoBasico = 3000;
	private int cantHijos;
	
	@Override
	public double sueldo() {
		return (getSueldoBasico() + plusPorCantidadDeHijos()) * porcentajeDeDescuentoDeSueldo();
	}

	public int plusPorCantidadDeHijos() {
		return 150 * getCantHijos();
	}

	public double getSueldoBasico() {
		return this.sueldoBasico;
	}
	
	public int getCantHijos() {
		return this.cantHijos;
	}
}