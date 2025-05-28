package ar.edu.unq.po2.tpstreamyenum.ej2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ActividadSemanalTestCase {

    private ActividadSemanal actividadFutbol;
    private ActividadSemanal actividadRunning;
    private ActividadSemanal actividadTenis;
    private List<ActividadSemanal> actividades;

    @BeforeEach
    public void setUp() {
        actividadFutbol = new ActividadSemanal(DiaDeLaSemana.LUNES, LocalTime.of(14, 0), 60, Deporte.FUTBOL, LocalTime.of(14, 0));
        actividadRunning = new ActividadSemanal(DiaDeLaSemana.JUEVES, LocalTime.of(16, 0), 45, Deporte.RUNNING, LocalTime.of(16, 0));
        actividadTenis = new ActividadSemanal(DiaDeLaSemana.MARTES, LocalTime.of(10, 0), 90, Deporte.TENNIS, LocalTime.of(10, 0));

        actividades = List.of(actividadFutbol, actividadRunning, actividadTenis);
    }

    @Test
    public void testCostoFutbolLunes() {
        // Lunes + complejidad 3 * 200 = 500 + 600 = 1100
        assertEquals(900.0, actividadFutbol.costo(), 0.001);
    }

    @Test
    public void testCostoRunningJueves() {
        // Jueves + complejidad 2 * 200 = 1000 + 400 = 1400
        assertEquals(1200.0, actividadRunning.costo(), 0.001);
    }

    @Test
    public void testEsFutbol() {
        assertTrue(actividadFutbol.esFutbol());
        assertFalse(actividadRunning.esFutbol());
    }

    @Test
    public void testActividadesDeFutbol() {
        List<ActividadSemanal> resultado = actividadFutbol.actividadesDeFutbol(actividades);
        assertEquals(1, resultado.size());
        assertEquals(Deporte.FUTBOL, resultado.get(0).getDeporte());
    }

    @Test
    public void testActividadesDeComplejidad() {
        List<ActividadSemanal> resultado = actividadFutbol.actividadesDeComplejidad(actividades, 5);
        assertEquals(1, resultado.size());
        assertEquals(Deporte.TENNIS, resultado.get(0).getDeporte());
    }

    @Test
    public void testCantidadTotalDeHorasSemanales() {
        int total = actividadFutbol.cantidadTotalDeHorasSemanales(actividades);
        assertEquals(195, total); // 60 + 45 + 90
    }

    @Test
    public void testActividadDeMenorCostoDeFutbol() {
        Optional<ActividadSemanal> menor = actividadFutbol.actividadDeMenorCostoDeDeporte(actividades, Deporte.FUTBOL);
        assertTrue(menor.isPresent());
        assertEquals(actividadFutbol, menor.get());
    }

    @Test
    public void testActividadMasEconomicaPorDeporte() {
        Map<Deporte, ActividadSemanal> mapa = actividadFutbol.actividadMasEconomicaPorDeporte(actividades);
        assertEquals(3, mapa.size());
        assertEquals(actividadFutbol, mapa.get(Deporte.FUTBOL));
        assertEquals(actividadRunning, mapa.get(Deporte.RUNNING));
        assertEquals(actividadTenis, mapa.get(Deporte.TENNIS));
    }
}