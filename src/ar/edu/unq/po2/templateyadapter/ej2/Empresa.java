package ar.edu.unq.po2.templateyadapter.ej2;

import java.util.List;
import java.util.ArrayList;

public class Empresa {
	
	private List<Empleado> empleados;
	
	public Empresa() {
		this.empleados = new ArrayList<>();
	}
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	
	public void agregarEmpleado(Empleado emp) {
		this.empleados.add(emp);
	}
	
	public void realizarPagoDeSueldos() {
		for(Empleado emp : this.empleados) {
			emp.cobrarSueldo();
		}
	}
}
