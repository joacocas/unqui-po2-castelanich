package ar.edu.unq.po2.tp6.banco;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private int dni;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	
	public Cliente(String nom, String apell, int dni, String direc, int edad, double sueldo) {
		this.nombre = nom;
		this.apellido = apell;
		this.dni = dni;
		this.direccion = direc;
		this.edad = edad;
		this.sueldoNetoMensual = sueldo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public int getEdad() {
		return this.edad;
	}

	public double getSueldoNetoMensual() {
		return this.sueldoNetoMensual;
	}
	
	public double getSueldonNetoAnual() {
		return this.sueldoNetoMensual * 12;
	}
	
	public void realizarSolicitudDeCreditoPersonalA(Banco banco, double monto, int plazo) {
		banco.registrarSolicitudDeCreditoPersonal(this, monto, plazo);
	}
	
	public void realizarSolicitudDeCreditoHipotecario(Banco banco, double monto, int plazo, Propiedad garantia) {
		banco.registrarSolicitudDeCreditoHipotecario(this, monto, plazo, garantia);
	}
	
}