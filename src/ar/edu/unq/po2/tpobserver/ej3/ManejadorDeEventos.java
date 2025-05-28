package ar.edu.unq.po2.tpobserver.ej3;
import java.util.*;

public class ManejadorDeEventos implements SujetoObservable {
    private List<Observer> observadores = new ArrayList<>();
    private List<Pregunta> preguntas = new ArrayList<>();
    private boolean juegoIniciado = false;

    public void agregarObserver(Observer o) {
        observadores.add(o);
        if (observadores.size() == 5) {
            iniciarPartida();
        }
    }

    public void eliminarObserver(Observer o) {
        observadores.remove(o);
    }

    public void notificarATodos(String mensaje) {
        for (Observer o : observadores) {
            o.notificar(mensaje);
        }
    }

    private void iniciarPartida() {
        juegoIniciado = true;
        cargarPreguntas();
        for (Observer o : observadores) {
            ((Jugador) o).iniciarJuego();
            o.notificar("El juego ha comenzado con las siguientes preguntas:");
            for (int i = 0; i < preguntas.size(); i++) {
                o.notificar((i + 1) + ". " + preguntas.get(i).getEnunciado());
            }
        }
    }

    private void cargarPreguntas() {
        preguntas.add(new Pregunta("Capital de Francia", "París"));
        preguntas.add(new Pregunta("2 + 2", "4"));
        preguntas.add(new Pregunta("Color del cielo", "Azul"));
        preguntas.add(new Pregunta("Lenguaje de Android", "Java"));
        preguntas.add(new Pregunta("Animal que ladra", "Perro"));
    }

    public void recibirRespuesta(Jugador jugador, int nroPregunta, String respuesta) {
        if (!juegoIniciado) return;

        Pregunta pregunta = preguntas.get(nroPregunta - 1);
        if (pregunta.esCorrecta(respuesta)) {
            jugador.incrementarRespuestasCorrectas();
            jugador.notificar("Respuesta correcta.");
            notificarATodos(jugador.getNombre() + " respondió correctamente la pregunta: " + pregunta.getEnunciado());

            if (jugador.getRespuestasCorrectas() == preguntas.size()) {
                notificarATodos("¡" + jugador.getNombre() + " ha ganado el juego!");
                finalizarJuego();
            }
        } else {
            jugador.notificar("Respuesta incorrecta.");
        }
    }

    private void finalizarJuego() {
        juegoIniciado = false;
        observadores.clear();
        preguntas.clear();
    }
}