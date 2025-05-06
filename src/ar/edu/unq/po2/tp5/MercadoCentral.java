package ar.edu.unq.po2.tp5;

import java.util.HashMap;
import java.util.Map;

public class MercadoCentral {
	
	private Map<Integer,Integer> stockDeProductos; // <idProducto, cantidad>

	public MercadoCentral() {
		this.stockDeProductos = new HashMap<>();
	}
	
	public Map<Integer,Integer> getStockDeProductos() {
		return this.stockDeProductos;
	}

	public void agregarProductoAlStock(Producto producto, int cantidad) {
	    stockDeProductos.put(producto.getId(), cantidad);
	}
	
	public boolean hayStock(int idProducto) {
	    return stockDeProductos.containsKey(idProducto) && stockDeProductos.get(idProducto) > 0;
	}
	
	public void decrementarStock(int idProducto) {
	    stockDeProductos.put(idProducto, stockDeProductos.get(idProducto) - 1);
	}
	
	public int stockDe(int idProducto) {
		return stockDeProductos.getOrDefault(idProducto, 0);
	}
}