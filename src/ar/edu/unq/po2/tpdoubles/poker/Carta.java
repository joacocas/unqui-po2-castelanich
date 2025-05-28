package ar.edu.unq.po2.tpdoubles.poker;

public class Carta {
	
	private int valor;
	private String palo;
	
	public Carta(int valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public String getPalo() {
		return this.palo;
	}
	
	public boolean esSuperiorA(Carta c) {
		return this.getValor() >  c.getValor();
	}
	
	public boolean sonDeMismoPalo(Carta c) {
		return this.getPalo().equals(c.getPalo());
	}
	
	public boolean sonDelMismoValor(Carta c) {
		return this.valor == c.getValor();
	}
	
	public boolean esIgualA(Carta c) {
		return this.sonDelMismoValor(c) && this.sonDeMismoPalo(c);
	}
}