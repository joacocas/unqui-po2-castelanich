package ar.edu.unq.po2.tp4.ej3;

import java.util.List;
import java.util.ArrayList;

public class Trabajador {
	
	private List<Ingreso> ingresos;
	
	public Trabajador() {
		this.ingresos = new ArrayList<>();
	}
	
	public void agregarIngreso(Ingreso ingreso) {
        ingresos.add(ingreso);
    }
	
	public double getTotalPercibido() {
		double total = 0.0;
		for(Ingreso i : ingresos) {
			total += i.getMontoPercibido();
		}
		return total;
	}
	
	public double getMontoImponible() {
		double total = 0.0;
		for(Ingreso i : ingresos) {
			total += i.getMontoImponible();
		}
		return total;
	}
	
	public double getImpuestoAPagar() {
		return getMontoImponible() * 0.02;
	}
}
