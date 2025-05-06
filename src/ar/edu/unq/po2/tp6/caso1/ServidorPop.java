package ar.edu.unq.po2.tp6.caso1;

import java.util.ArrayList;
import java.util.List;

public class ServidorPop implements IServidorBasico {
    
	private List<Correo> mensajesNuevos;
    private boolean conectado = false;

    public ServidorPop() {
        this.mensajesNuevos = new ArrayList<>();
    }

    @Override
    public void conectar(String nombreUsuario, String passUsuario) {
        if (nombreUsuario.equals("usuario") && passUsuario.equals("password")) {
            this.conectado = true;
        } else {
            throw new RuntimeException("Usuario o contraseña incorrectos");
        }
    }

    @Override
    public List<Correo> recibirNuevos(String user, String pass) {
        if (!this.conectado) {
            throw new RuntimeException("No se puede recibir correos sin estar conectado.");
        }
        List<Correo> copiaMensajes = new ArrayList<>(this.mensajesNuevos);
        this.mensajesNuevos.clear();
        return copiaMensajes;
    }

    @Override
    public void enviar(Correo correo) {
        if (!this.conectado) {
            throw new RuntimeException("No se puede enviar correos sin estar conectado.");
        }
        System.out.println("Correo enviado a: " + correo.getDestinatario() + " con asunto: " + correo.getAsunto());
    }
    
    @Override
	public float tazaDeTransferencia() {
		return 1.0f;
	}
    
    public boolean isConectado() {
        return this.conectado;
    }

	
}