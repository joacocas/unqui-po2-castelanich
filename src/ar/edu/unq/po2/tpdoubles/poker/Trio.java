package ar.edu.unq.po2.tpdoubles.poker;

public class Trio implements Jugada{
	
	private int valor;
	
	public Trio(int valor) {
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
		return 1;
	}

	@Override
	public int getValorDesempate() {
		// TODO Auto-generated method stub
		return valor;
	}
}