package ar.edu.unq.po2.tp6.caso1;

public class ClienteEmail {
	
	private ClienteConexion conexion;
	private GestorCorreos gestor;
	
	public ClienteEmail(IServidorBasico server, String usuario, String password) {
		this.conexion = new ClienteConexion(server, usuario, password);
		this.gestor = new GestorCorreos();
		this.conectar();
	}
	
	public void conectar() {
		this.conexion.conectar();
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo) {
        Correo correo = new Correo(asunto, destinatario, cuerpo);
        this.conexion.enviarCorreo(correo);
    }

    public void recibirNuevos() {
        this.gestor.recibirNuevos(this.conexion.recibirCorreos());
    }

    public void borrarCorreo(Correo correo) {
        this.gestor.borrarCorreo(correo);
    }

    public void eliminarBorrado(Correo correo) {
        this.gestor.eliminarBorrado(correo);
    }

    public int contarInbox() {
        return this.gestor.contarInbox();
    }

    public int contarBorrados() {
        return this.gestor.contarBorrados();
    }
}