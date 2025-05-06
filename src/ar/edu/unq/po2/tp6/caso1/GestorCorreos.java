package ar.edu.unq.po2.tp6.caso1;

import java.util.ArrayList;
import java.util.List;

public class GestorCorreos {
	
	private List<Correo> inbox;
	private List<Correo> borrados;
	
	public GestorCorreos() {
		this.inbox = new ArrayList<>();
		this.borrados = new ArrayList<>();
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.add(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(List<Correo> nuevosCorreos){
		this.inbox.addAll(nuevosCorreos);
	}
}