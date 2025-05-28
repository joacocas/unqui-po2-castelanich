package ar.edu.unq.po2.tpobserver.ej2;

import java.util.List;

public class Partido {
	
	private String resultado;
	private List<String> contrincantes;
	private String deporte;
	private ManejadorDeEventos manejador;
	
	public Partido(String res, List<String> contr, String dep) {
		this.resultado = res;
		this.contrincantes = contr;
		this.deporte = dep;
	}

	public String getResultado() {
		return resultado;
	}

	public List<String> getContrincantes() {
		return contrincantes;
	}
	
	public String getDeporte() {
		return deporte;
	}
	
	public ManejadorDeEventos getManejador() {
		return manejador;
	}
	
	public void enviarInformacionDePartido() {
		manejador.recibirInformacion(this);
	}
}