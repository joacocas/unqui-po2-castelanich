package ar.edu.unq.po2.tp5;

public class ProductoDeCooperativa extends Producto {
	
	public ProductoDeCooperativa(int id, String nombre, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	@Override
	public double montoAPagar() {
		return this.precio * 0.9;
	}
}