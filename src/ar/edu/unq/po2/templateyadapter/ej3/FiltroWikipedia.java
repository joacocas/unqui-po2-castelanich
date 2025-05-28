package ar.edu.unq.po2.templateyadapter.ej3;

import java.util.List;
import java.util.ArrayList;

public abstract class FiltroWikipedia {
	
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		List<WikipediaPage> resultado = new ArrayList<>();
		
		for(WikipediaPage otraPagina : wikipedia) {
			if(this.esSimilar(page, otraPagina)) {
				resultado.add(otraPagina);
			}
		}
		return resultado;
	}
	
	protected abstract boolean esSimilar(WikipediaPage page1, WikipediaPage page2);
}
