package ar.edu.unq.po2.tpcomposite.ej4;

public interface FyleSystem {
	
	public int totalSize();
	
	public void printStructure(String identacion);
	
	public FyleSystem lastModified();
	
	public FyleSystem oldestElement();
}
