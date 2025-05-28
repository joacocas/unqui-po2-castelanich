package ar.edu.unq.po2.templateyadapter.ej3;

public class PropiedadEnComun extends FiltroWikipedia{

	@Override
	protected boolean esSimilar(WikipediaPage page1, WikipediaPage page2) {
		return page1.getInfobox().keySet().stream()
				.anyMatch(page2.getInfobox().keySet()::contains);
	}
}
