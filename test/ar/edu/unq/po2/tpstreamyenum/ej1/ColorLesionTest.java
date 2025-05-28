package ar.edu.unq.po2.tpstreamyenum.ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ColorLesionTest {

	@Test
    public void testDescripcion() {
        assertEquals("Rojo", ColorLesion.ROJO.getDescripcion());
        assertEquals("Gris", ColorLesion.GRIS.getDescripcion());
        assertEquals("Amarillo", ColorLesion.AMARILLO.getDescripcion());
        assertEquals("Miel", ColorLesion.MIEL.getDescripcion());
    }

    @Test
    public void testNivelRiesgo() {
        assertEquals("Alto", ColorLesion.ROJO.getNivelDeRiesgo());
        assertEquals("Medio alto", ColorLesion.GRIS.getNivelDeRiesgo());
        assertEquals("Medio bajo", ColorLesion.AMARILLO.getNivelDeRiesgo());
        assertEquals("Bajo", ColorLesion.MIEL.getNivelDeRiesgo());
    }

    @Test
    public void testSiguienteColor() {
        assertEquals(ColorLesion.GRIS, ColorLesion.ROJO.getSiguienteColor());
        assertEquals(ColorLesion.AMARILLO, ColorLesion.GRIS.getSiguienteColor());
        assertEquals(ColorLesion.MIEL, ColorLesion.AMARILLO.getSiguienteColor());
        assertEquals(ColorLesion.ROJO, ColorLesion.MIEL.getSiguienteColor());
    }

    @Test
    public void testRotacionCompleta() {
        ColorLesion inicio = ColorLesion.ROJO;
        ColorLesion actual = inicio;

        for (int i = 0; i < 4; i++) {
            actual = actual.getSiguienteColor();
        }

        assertEquals(inicio, actual); // Después de 4 pasos vuelve al original
    }

}
