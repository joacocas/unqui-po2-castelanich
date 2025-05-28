package ar.edu.unq.po2.tpobserver.ej1;

import java.util.List;

public class Sistema {
	
	private List<ArticuloCientifico> articulos;
	private ManejadorDeEventos manejador;
	
	
	public List<ArticuloCientifico> getArticulos() {
		return articulos;
	}
	
	public void setArticulos(List<ArticuloCientifico> articulos) {
		this.articulos = articulos;
	}
	
	public void agregarArticulo(ArticuloCientifico a) {
		articulos.add(a);
	}
	
	public ManejadorDeEventos getManejador() {
		return manejador;
	}
	
	public void enviarUltimasActualizaciones() {
		manejador.enviarUltimasActualizacionesA(articulos);
	}
}