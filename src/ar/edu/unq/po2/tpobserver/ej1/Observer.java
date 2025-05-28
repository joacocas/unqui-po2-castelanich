package ar.edu.unq.po2.tpobserver.ej1;

import java.util.List;

public interface Observer {
	
	public void notificar(List<ArticuloCientifico> articulos);
	
}