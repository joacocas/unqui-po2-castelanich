package ar.edu.unq.po2.templateyadapter.ej2;

public class Temporario extends Empleado{
	
	private double sueldoBasico = 1000;
	private int horasTrabajadas;
	private boolean estaCasado;
	private boolean tieneHijos;
	
	@Override
	public double sueldo() {
		if(estaCasado || tieneHijos) {
			return (this.getSueldoBasico() + plusDeHorasTrabajadas() + comisionPorTenerHijoOEstarCasado()) * porcentajeDeDescuentoDeSueldo();
		}
		return this.getSueldoBasico() + plusDeHorasTrabajadas();
	}

	public int comisionPorTenerHijoOEstarCasado() {
		return 100;
	}

	public int plusDeHorasTrabajadas() {
		return 5 * this.horasTrabajadas;
	}
	
	public double getSueldoBasico() {
		return this.sueldoBasico;
	}
}