package ar.edu.unq.po2.tpobserver.ej1;

public class CriterioPorTipo implements Criterio{
	
	private String tipo;
	
	public CriterioPorTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public boolean cumple(ArticuloCientifico articulo) {
		return articulo.getTipo().equalsIgnoreCase(tipo);
	}
}
