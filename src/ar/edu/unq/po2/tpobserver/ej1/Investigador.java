package ar.edu.unq.po2.tpobserver.ej1;

import java.util.List;

public class Investigador implements Observer{

	private String nombre;
	private Criterio crit;
	
	public Investigador(String nombre, Criterio crit) {
		this.nombre = nombre;
		this.crit = crit;
	}
	
	@Override
	public void notificar(List<ArticuloCientifico> articulos) {
		for(ArticuloCientifico art : articulos) {
			if(crit.cumple(art)) {
				System.out.println(nombre + " recibio notificacion del articulo " + art.getTitulo());
			}
		}
		
	}

}
