package ar.edu.unq.po2.tpobserver.ej1;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import java.util.List;

public class ManejadorDeEventosTestCase {

    @Test
    public void testObserverEsNotificadoConArticulo() {
        // Arrange
        Observer observer = mock(Observer.class);
        ManejadorDeEventos manejador = new ManejadorDeEventos();
        manejador.subscribir(observer);

        ArticuloCientifico articulo = new ArticuloCientifico("AI", null, "Autor", "Smalltalks", null, null);
        List<ArticuloCientifico> articulos = List.of(articulo);

        // Act
        manejador.enviarUltimasActualizacionesA(articulos);

        // Assert
        verify(observer).notificar(articulos);
    }

    @Test
    public void testObserverNoEsNotificadoSiSeDesuscribe() {
        Observer observer = mock(Observer.class);
        ManejadorDeEventos manejador = new ManejadorDeEventos();
        manejador.subscribir(observer);
        manejador.desuscribir(observer);

        ArticuloCientifico articulo = new ArticuloCientifico("AI", null, "Autor", "Smalltalks", null, null);
        List<ArticuloCientifico> articulos = List.of(articulo);

        manejador.enviarUltimasActualizacionesA(articulos);

        verify(observer, never()).notificar(any());
    }

    @Test
    public void testVariosObserversRecibenNotificacion() {
        Observer o1 = mock(Observer.class);
        Observer o2 = mock(Observer.class);

        ManejadorDeEventos manejador = new ManejadorDeEventos();
        manejador.subscribir(o1);
        manejador.subscribir(o2);

        ArticuloCientifico articulo = new ArticuloCientifico("Título", null, "Autor", "Lugar", null, null);
        List<ArticuloCientifico> articulos = List.of(articulo);

        manejador.enviarUltimasActualizacionesA(articulos);

        verify(o1).notificar(articulos);
        verify(o2).notificar(articulos);
    }
}
