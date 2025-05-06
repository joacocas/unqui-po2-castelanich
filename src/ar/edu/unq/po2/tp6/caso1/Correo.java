package ar.edu.unq.po2.tp6.caso1;

public class Correo {
	
	private String asunto;
	private String destinatario;
	private String cuerpo;
	
	public Correo(String asunto, String destinatario, String cuerpo) {
		this.asunto = asunto;
		this.destinatario = destinatario;
		this.cuerpo = cuerpo;
	}

	public String getDestinatario() {
		return this.destinatario;
	}
	
	public String getAsunto() {
		return this.asunto;
	}

	public String getCuerpo() {
		return cuerpo;
	}
}