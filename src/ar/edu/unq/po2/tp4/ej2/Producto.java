package ar.edu.unq.po2.tp4.ej2;

public class Producto {
	
	private String nombre;
	private double precio;
	private boolean perteneceAlProgramaDePreciosCiudados = false;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.perteneceAlProgramaDePreciosCiudados = esPrecioCuidado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void aumentarPrecio(double precioAAumentar) {
		this.precio += precioAAumentar;
	}
	
	public boolean esPrecioCuidado() {
		return this.perteneceAlProgramaDePreciosCiudados;
	}
}