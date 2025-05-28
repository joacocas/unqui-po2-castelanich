package ar.edu.unq.po2.templateyadapter.ej2;

public class Pasante extends Empleado{
	
	private int horasTrabajadasEnElMes;
	
	@Override
	public double sueldo() {
		return (40 * this.horasTrabajadasEnElMes) * porcentajeDeDescuentoDeSueldo();
	}
}