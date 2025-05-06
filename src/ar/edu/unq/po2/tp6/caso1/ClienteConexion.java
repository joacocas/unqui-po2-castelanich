package ar.edu.unq.po2.tp6.caso1;

import java.util.ArrayList;
import java.util.List;

public class ClienteConexion {
	
	private IServidorBasico servidor;
	private String nombreUsuario;
	private String passUsuario;
	private ArrayList<Correo> inbox;
	
	public ClienteConexion(IServidorBasico servidor, String nombreUsuario, String pass){
		this.servidor= servidor;
		this.nombreUsuario= nombreUsuario;
		this.passUsuario= pass;
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario, this.passUsuario);
	}
	
	public void enviarCorreo(Correo correo) {
		this.servidor.enviar(correo);
	}
	
	public List<Correo> recibirCorreos() {
		return this.servidor.recibirNuevos(this.nombreUsuario, this.passUsuario);
	}

	public ArrayList<Correo> getInbox() {
		return inbox;
	}
}