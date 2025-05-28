package ar.edu.unq.po2.tpobserver.ej1;

public class CriterioAND implements Criterio{
	
	private Criterio c1;
	private Criterio c2;
	
	public CriterioAND(Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public boolean cumple(ArticuloCientifico articulo) {
		return c1.cumple(articulo) && c2.cumple(articulo);
	}

}
