package ar.edu.unq.po2.tp3;

import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.Period;

public class Persona {
	
	String nombre;
	String apellido;
	Date fechaNacimiento;
	
	public Persona(String nombre, String apellido, Date fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaDeNacimiento;
	}
	
	public String nombreDePersona() {
		return this.nombre;
	}
	
	public Date fechaDeNacimientoDePersona() {
		return this.fechaNacimiento;
	}

	public String apellidoDePersona() {
		return this.apellido;
	}
	
	public int edadDePersona() {
		LocalDate nacimiento = this.fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate hoy = LocalDate.now();
		
		return Period.between(nacimiento, hoy).getYears();
	}
	
	public boolean menorQue(Persona persona) {
		return this.edadDePersona() < persona.edadDePersona();
	}
	
	
}
