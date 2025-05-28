package ar.edu.unq.po2.tpdoubles.poker;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase {
	
	PokerStatus ps;
	
	Carta c1;
	Carta c2;
	Carta c3;
	Carta c4;
	Carta c5;
	
	@BeforeEach
	void setUp() {
		//Setup
		ps = new PokerStatus();
		
	}
	
	@Test
    public void testDevuelvePoker() {
        //  SETUP
        List<Carta> cartas = List.of(
            new Carta(10, "D"),
            new Carta(10, "T"),
            new Carta(10, "C"),
            new Carta(10, "P"),
            new Carta(2, "D")
        );

        //  EXERCISE
        Jugada jugada = ps.verificar(cartas);

        //  VERIFY
        assertEquals("Poker", jugada.getClass().getSimpleName());
        assertEquals(10, jugada.getValorDesempate());

        //  TEARDOWN: no hace falta, no hay recursos persistentes
    }

    @Test
    public void testDevuelveTrio() {
        List<Carta> cartas = List.of(
            new Carta(9, "D"),
            new Carta(9, "T"),
            new Carta(9, "P"),
            new Carta(5, "C"),
            new Carta(6, "D")
        );

        Jugada jugada = ps.verificar(cartas);

        assertEquals("Trio", jugada.getClass().getSimpleName());
        assertEquals(9, jugada.getValorDesempate());
    }

    @Test
    public void testDevuelveColor() {
        List<Carta> cartas = List.of(
            new Carta(7, "D"),
            new Carta(7, "D"),
            new Carta(7, "D"),
            new Carta(7, "D"),
            new Carta(7, "D")
        );

        Jugada jugada = ps.verificar(cartas);

        assertEquals("Color", jugada.getClass().getSimpleName());
        assertEquals(7, jugada.getValorDesempate());
    }

    @Test
    public void testDevuelveJugadaNula() {
        List<Carta> cartas = List.of(
            new Carta(2, "C"),
            new Carta(3, "D"),
            new Carta(4, "T"),
            new Carta(5, "P"),
            new Carta(6, "D")
        );

        Jugada jugada = ps.verificar(cartas);

        assertEquals("JugadaNula", jugada.getClass().getSimpleName());
        assertEquals(0, jugada.getValorDesempate());
    }

    @Test
    public void testPokerLeGanaATrio() {
        Jugada poker = new Poker(10);
        Jugada trio = new Trio(13);

        assertTrue(poker.compareTo(trio) > 0); //VERIFY
    }

    @Test
    public void testColorPierdeConPoker() {
        Jugada color = new Color(12);
        Jugada poker = new Poker(2);

        assertTrue(color.compareTo(poker) < 0);
    }

    @Test
    public void testEmpateEntreColores() {
        Jugada color1 = new Color(8);
        Jugada color2 = new Color(8);

        assertEquals(0, color1.compareTo(color2));
    }
}   