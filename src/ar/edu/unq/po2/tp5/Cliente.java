package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nombre;
	private List<Cobrable> productosAAdquirir;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
		this.productosAAdquirir = new ArrayList<>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<Cobrable> getProductosCobrables() {
		return productosAAdquirir;
	}
	
	public void agregarCobrable(Producto prod) {
		this.productosAAdquirir.add(prod);
	}
}