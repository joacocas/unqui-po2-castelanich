package ar.edu.unq.po2.tpcomposite.ej6;

import java.util.List;
import java.util.ArrayList;

public class LeafShapeShifter implements IShapeShifter{
	
	private int value;
	
	public LeafShapeShifter(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	@Override
	public IShapeShifter compose(IShapeShifter ish) {
		CompositeShapeShifter composite = new CompositeShapeShifter();
		composite.add(this);
		composite.add(ish);
		return composite;
	}

	@Override
	public int deepset() {
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		List<Integer> result = new ArrayList<>();
		return result;
	}

}
