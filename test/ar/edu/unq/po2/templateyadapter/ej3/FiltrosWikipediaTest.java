package ar.edu.unq.po2.templateyadapter.ej3;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FiltrosWikipediaTest {

	@Test
    public void testMismoLetraInicial() {
        WikipediaPage bernal = new WikipediaPageImp("Bernal", List.of(), Map.of());
        WikipediaPage buenosAires = new WikipediaPageImp("Buenos Aires", List.of(), Map.of());
        WikipediaPage berazategui = new WikipediaPageImp("Berazategui", List.of(), Map.of());
        WikipediaPage quilmes = new WikipediaPageImp("Quilmes", List.of(), Map.of());

        FiltroWikipedia filtro = new MismaLetraInicial();

        List<WikipediaPage> similares = filtro.getSimilarPages(bernal, List.of(buenosAires, berazategui, quilmes));

        assertTrue(similares.contains(berazategui));
        assertTrue(similares.contains(buenosAires));
        assertFalse(similares.contains(quilmes));
    }

    @Test
    public void testLinkEnComun() {
        WikipediaPage laPlata = new WikipediaPageImp("La Plata", List.of(), Map.of());
        WikipediaPage gimnasia = new WikipediaPageImp("Gimnasia", List.of(laPlata), Map.of());
        WikipediaPage buenosAires = new WikipediaPageImp("Buenos Aires", List.of(laPlata), Map.of());
        WikipediaPage quilmes = new WikipediaPageImp("Quilmes", List.of(), Map.of());

        FiltroWikipedia filtro = new LinkEnComun();

        List<WikipediaPage> similares = filtro.getSimilarPages(gimnasia, List.of(buenosAires, quilmes));

        assertTrue(similares.contains(buenosAires));
        assertFalse(similares.contains(quilmes));
    }

    @Test
    public void testPropiedadEnComun() {
        WikipediaPageImp persona1 = new WikipediaPageImp(
            "Persona1", List.of(), Map.of("birth_place", new WikipediaPageImp("Quilmes", List.of(), Map.of()))
        );

        WikipediaPageImp persona2 = new WikipediaPageImp(
            "Persona2", List.of(), Map.of("birth_place", new WikipediaPageImp("Buenos Aires", List.of(), Map.of()))
        );

        WikipediaPageImp persona3 = new WikipediaPageImp(
            "Persona3", List.of(), Map.of("ocupacion", new WikipediaPageImp("Doctor", List.of(), Map.of()))
        );

        FiltroWikipedia filtro = new PropiedadEnComun();

        List<WikipediaPage> similares = filtro.getSimilarPages(persona1, List.of(persona2, persona3));

        assertTrue(similares.contains(persona2));  // tienen la misma key: birth_place
        assertFalse(similares.contains(persona3)); // no comparten propiedades
    }
}
