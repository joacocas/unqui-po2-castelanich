package ar.edu.unq.po2.tpdoubles.poker;

import java.util.List;

public class PokerStatus {
	
	public Jugada verificar(List<Carta> cartas) {
		if(hayColor(cartas)) {
			return new Color(cartas.get(0).getValor());
		}
		if(hayPoker(cartas)) {
			return new Poker(valorRepetido(cartas, 4));
		}
		if(hayTrio(cartas)) {
			return new Trio(valorRepetido(cartas, 3));
		}
		return new JugadaNula();
	}
	
	private boolean hayColor(List<Carta> cartas) {
        Carta referencia = cartas.get(0);
        for (Carta carta : cartas) {
            if (!carta.esIgualA(referencia)) {
                return false;
            }
        }
        return true;
    }

    private boolean hayPoker(List<Carta> cartas) {
        return hayRepeticion(cartas, 4);
    }

    private boolean hayTrio(List<Carta> cartas) {
        return hayRepeticion(cartas, 3);
    }

    private boolean hayRepeticion(List<Carta> cartas, int cantidad) {
        for (Carta base : cartas) {
            int repeticiones = 0;
            for (Carta c : cartas) {
                if (c.sonDelMismoValor(base)) {
                    repeticiones++;
                }
            }
            if (repeticiones >= cantidad) {
                return true;
            }
        }
        return false;
    }

    private int valorRepetido(List<Carta> cartas, int cantidad) {
        for (Carta base : cartas) {
            int repeticiones = 0;
            for (Carta c : cartas) {
                if (c.sonDelMismoValor(base)) {
                    repeticiones++;
                }
            }
            if (repeticiones >= cantidad) {
                return base.getValor();
            }
        }
        return -1; // nunca debería llegar acá si se llama bien
    }
}   