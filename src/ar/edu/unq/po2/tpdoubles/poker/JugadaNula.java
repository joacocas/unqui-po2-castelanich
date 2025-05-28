package ar.edu.unq.po2.tpdoubles.poker;

public class JugadaNula implements Jugada{

	@Override
	public int compareTo(Jugada o) {
	    if (this.getValorJugada() != o.getValorJugada()) {
            return Integer.compare(this.getValorJugada(), o.getValorJugada());
        }
        return Integer.compare(this.getValorDesempate(), o.getValorDesempate());
    }

	@Override
	public int getValorJugada() {
		return 0;
	}

	@Override
	public int getValorDesempate() {
		return 0;
	}

}
