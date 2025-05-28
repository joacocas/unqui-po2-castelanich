package ar.edu.unq.po2.tpcomposite.ej6;

import java.util.List;

public interface IShapeShifter {
	
	public IShapeShifter compose(IShapeShifter ish);
	
	public int deepset();
	
	public IShapeShifter flat();
	
	public List<Integer> values();
	
}
