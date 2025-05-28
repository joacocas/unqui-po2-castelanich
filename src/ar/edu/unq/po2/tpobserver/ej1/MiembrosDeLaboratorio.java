package ar.edu.unq.po2.tpobserver.ej1;

import java.util.List;

public class MiembrosDeLaboratorio implements Observer{
	
	private String nombreGrupo;
	private Criterio crit;
	
	@Override
	public void notificar(List<ArticuloCientifico> articulos) {
		for(ArticuloCientifico art : articulos) {
			if(crit.cumple(art)) {
				System.out.println(nombreGrupo + " recibieron notificacion del articulo " + art.getTitulo());
			}
		}
		
	}	
}