package ar.edu.unq.po2.tpobserver.ej1;

public class CriterioPorConferencia implements Criterio{
	
	private String conferencia;
	
	public CriterioPorConferencia(String conferencia) {
		this.conferencia = conferencia;
	}
	
	@Override
	public boolean cumple(ArticuloCientifico articulo) {
		return articulo.getLugarPublicacion().equalsIgnoreCase(conferencia);
	}

}
