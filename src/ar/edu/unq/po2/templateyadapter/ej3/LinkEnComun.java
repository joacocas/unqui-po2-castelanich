package ar.edu.unq.po2.templateyadapter.ej3;

public class LinkEnComun extends FiltroWikipedia{

	@Override
	protected boolean esSimilar(WikipediaPage page1, WikipediaPage page2) {
		for(WikipediaPage link1 : page1.getLinks()) {
			if(page2.getLinks().contains(link1)) {
				return true;
			}
		}		
		return false;
	}
}