package ar.edu.unq.po2.templateyadapter.ej3;

public class MismaLetraInicial extends FiltroWikipedia{

	@Override
	protected boolean esSimilar(WikipediaPage page1, WikipediaPage page2) {
		return page1.getTitle().charAt(0) == page2.getTitle().charAt(0);
	}

}
