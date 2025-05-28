package ar.edu.unq.po2.tpcomposite.ej3;

public class Punto {
	
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public boolean estaLibre() {
		return true;
	}
}