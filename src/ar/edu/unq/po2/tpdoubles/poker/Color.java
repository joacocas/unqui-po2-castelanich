package ar.edu.unq.po2.tpdoubles.poker;

public class Color implements Jugada{
	
	private int valor;
	
	public Color(int valor) {
		this.valor = valor;
	}
	
	@Override
	public int compareTo(Jugada o) {
		if (this.getValorJugada() != o.getValorJugada()) {
            return Integer.compare(this.getValorJugada(), o.getValorJugada());
        }
       return Integer.compare(this.getValorDesempate(), o.getValorDesempate());
    }

	@Override
	public int getValorJugada() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getValorDesempate() {
		// TODO Auto-generated method stub
		return valor;
	}
}