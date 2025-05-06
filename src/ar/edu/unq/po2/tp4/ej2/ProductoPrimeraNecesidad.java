package ar.edu.unq.po2.tp4.ej2;

import ar.edu.unq.po2.tp4.ej1.Producto;

public class ProductoPrimeraNecesidad extends Producto{
	
	private double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio);
		this.descuento = descuento;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * (1 - descuento);
	}
}