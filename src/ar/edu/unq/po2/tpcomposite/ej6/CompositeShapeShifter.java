package ar.edu.unq.po2.tpcomposite.ej6;

import java.util.List;
import java.util.ArrayList;

public class CompositeShapeShifter implements IShapeShifter{
	
	private List<IShapeShifter> children = new ArrayList<>();
	
	public void add(IShapeShifter shs) {
		children.add(shs);
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
		int maxDepth = 0;
		for (IShapeShifter child : children) {
			maxDepth = Math.max(maxDepth, child.deepset() + 1);
		}
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		CompositeShapeShifter flatResult = new CompositeShapeShifter();
		for(IShapeShifter child : children) {
			IShapeShifter flatChild = child.flat();
			if(flatChild instanceof LeafShapeShifter) {
				flatResult.add(flatChild);
			} else if (flatChild instanceof CompositeShapeShifter) {
				CompositeShapeShifter compositeChild = (CompositeShapeShifter) flatChild;
				for (IShapeShifter grandChild : compositeChild.getChildren()) {
					flatResult.add(grandChild);
				}
			}
		}
		return flatResult.getChildren().isEmpty() ? this : flatResult;
	}

	@Override
	public List<Integer> values() {
		List<Integer> result = new ArrayList<>();
		for(IShapeShifter child : children) {
			result.addAll(child.values());
		}
		return result;
	}
	
	public List<IShapeShifter> getChildren() {
		return children;
	}

}
