package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	
	String nombreDeEquipo;
	List<Persona> integrantes = new ArrayList<>();
	
	public EquipoDeTrabajo(String nombre, Persona[] personas) {
		this.nombreDeEquipo = nombre;
		
		for(Persona p : personas) {
			this.integrantes.add(p);
		}
	}
	
	public String nombreDeEquipoDeTrabajo() {
		return this.nombreDeEquipo;
	}
	
	public double promedioDeEdadDeIntegrantes() {
		if(integrantes.isEmpty()) {
			return 0;
		}
		
		int sumaDeEdades = 0;
		
		for(Persona p : integrantes) {
			sumaDeEdades += p.edadDePersona();
		}
		return (double) sumaDeEdades / integrantes.size();
	}
}
