package ar.edu.unq.po2.templateyadapter.ej2;

public abstract class Empleado {
	
	private String nombre;
	
	public abstract double sueldo();
	
	public String getNombre() {
		return nombre;
	}
	
	public double porcentajeDeDescuentoDeSueldo() {
		return 0.13;
	}
	
	public void cobrarSueldo() {
		System.out.println("He cobrado: " + sueldo());
	}	
}