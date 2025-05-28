package ar.edu.unq.po2.templateyadapter.ej3;

import java.util.List;
import java.util.Map;

public class WikipediaPageImp implements WikipediaPage{
	
	private String title;
	private List<WikipediaPage> links;
	private Map<String, WikipediaPage> infobox;
	
	public WikipediaPageImp(String title, List<WikipediaPage> links, Map<String, WikipediaPage> infobox) {
        this.title = title;
        this.links = links;
        this.infobox = infobox;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public List<WikipediaPage> getLinks() {
        return this.links;
    }

    @Override
    public Map<String, WikipediaPage> getInfobox() {
        return this.infobox;
    }
}