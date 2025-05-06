package ar.edu.unq.po2.tp3;

public class Cuadrado {
	
	private Punto esquinaSuperiorIzquierda;
	private int lado;
	
	public Cuadrado(Punto esquinaSupIzq, int largoLado) {
		if(largoLado <= 0) {
			throw new IllegalArgumentException("El lado debe ser mayor a 0");
		}
		
		this.esquinaSuperiorIzquierda = esquinaSupIzq;
		this.lado = largoLado;
	}
	
	public int getMedidaLado() {
		return this.lado;
	}
	
	public Punto getEsquinaSuperiorIzquierda() {
		return this.esquinaSuperiorIzquierda;
	}
	
	public Punto getEsquinaSuperiorDerecha() {
		return new Punto(this.esquinaSuperiorIzquierda.getPuntoX() + this.getMedidaLado(), this.esquinaSuperiorIzquierda.getPuntoY());
	}
	
	public Punto getEsquinaInferiorIzquierda() {
		return new Punto(this.esquinaSuperiorIzquierda.getPuntoX(), this.esquinaSuperiorIzquierda.getPuntoY() - this.getMedidaLado());
	}
	
	public Punto getEsquinaInferiorDerecha() {
		return new Punto(this.esquinaSuperiorIzquierda.getPuntoX() + this.getMedidaLado(), this.esquinaSuperiorIzquierda.getPuntoY() - this.getMedidaLado());
	}
	
	public int calcularPerimetro() {
		return 4 * this.lado;
	}
	
	public int calcularArea() {
		return this.lado * this.lado;
	}
}
