package ar.edu.unq.po2.tp6.caso1;

import java.util.List;

public interface IServidorBasico {
	
	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String nombreUsuario, String passUsuario);

	public void enviar(Correo correo);
	
	public float tazaDeTransferencia();
}