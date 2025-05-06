package ar.edu.unq.po2.tp4.ej1;

import java.util.List;
import java.util.ArrayList;

public class Supermercado {

	String nombre;
	String direccion;
	List<Producto> productos = new ArrayList<>();
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public double getPrecioTotal() {
		int precioTotal = 0;
		for(Producto p : productos) {
			precioTotal += p.getPrecio();
		}
		return precioTotal;
	}
}