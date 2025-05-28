package ar.edu.unq.po2.tpobserver.ej3;

public class Jugador implements Observer {
    private String nombre;
    private ManejadorDeEventos manejador;
    private int respuestasCorrectas;
    private boolean esperandoInicio = true;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.respuestasCorrectas = 0;
    }

    public void solicitarParticipacion(ManejadorDeEventos manejador) {
        this.manejador = manejador;
        manejador.agregarObserver(this);
    }

    public void responder(int numeroPregunta, String respuesta) {
        if (esperandoInicio) {
            System.out.println(nombre + ": Acción no permitida, la partida aún no inició.");
        } else {
            manejador.recibirRespuesta(this, numeroPregunta, respuesta);
        }
    }

    public void iniciarJuego() {
        esperandoInicio = false;
    }

    public void incrementarRespuestasCorrectas() {
        respuestasCorrectas++;
    }

    public int getRespuestasCorrectas() {
        return respuestasCorrectas;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("[" + nombre + "] " + mensaje);
    }
}

