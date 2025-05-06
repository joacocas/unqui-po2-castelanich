package ar.edu.unq.po2.tp3;

public class Punto {

	private int puntoX;
	private int puntoY;
	
	public int getPuntoY() {
		return puntoY;
	}

	public void setPuntoY(int puntoY) {
		this.puntoY = puntoY;
	}

	public int getPuntoX() {
		return puntoX;
	}

	public void setPuntoX(int puntoX) {
		this.puntoX = puntoX;
	}
	
	public Punto() {
		this.setPuntoX(0);
		this.setPuntoY(0);
	}
	
	public Punto(int x, int y) {
		this.setPuntoX(x);
		this.setPuntoY(y);
	}
	
	public void moverPuntoAPosicion(int nuevoX, int nuevoY) {
        this.puntoX = nuevoX;
        this.puntoY = nuevoY;
	}
	
	public Punto puntoDeSumarOtroPunto(Punto otroPunto) {
		int nuevoX = this.puntoX + otroPunto.puntoX;
		int nuevoY = this.puntoY + otroPunto.puntoY;
		return new Punto(nuevoX, nuevoY);
	}
}

