package ar.edu.unq.po2.tpdoubles.poker;

public class Poker implements Jugada{
	
	private int valor;
	
	public Poker(int valor) {
		this.valor = valor;
	}
	
	@Override
	public int getValorDesempate() {
		return valor;
	}

	@Override
	public int compareTo(Jugada o) {
		if(this.getValorJugada() != o.getValorJugada()) {
			return Integer.compare(this.getValorJugada(), o.getValorJugada());
		}
		return Integer.compare(this.getValorDesempate(), o.getValorDesempate());
	}

	@Override
	public int getValorJugada() {
		return 3;
	}
}
