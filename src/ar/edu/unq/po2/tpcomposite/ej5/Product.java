package ar.edu.unq.po2.tpcomposite.ej5;

public class Product {
	
	protected float price;
	private String name;
	
	public Product(float pr, String name) {
		this.price = pr;
		this.name = name;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.name;
	}
}
