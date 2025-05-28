package ar.edu.unq.po2.tpcomposite.ej5;

import java.util.List;

public class CarroDeCompras {
	
	private List<Product> products;
	
	public CarroDeCompras(List<Product> prods) {
		this.products = prods;
	}
	
	@SuppressWarnings("unused")
	private void setElements(List<Product> prods) {
		this.products.addAll(prods);
	}
	
	public List<Product> getElements() {
		return this.products;
	}
	
	public int totalRounded() {
		return (int) this.total();
	}
	
	public float total() {
		float totalProds = 0;
		for(Product prod : products) {
			totalProds += prod.getPrice();
		}
		return totalProds;
	}
}