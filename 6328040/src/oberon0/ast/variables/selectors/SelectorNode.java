package oberon0.ast.variables.selectors;

import java.util.ArrayList;
import java.util.List;

import oberon0.environment.Context;
import oberon0.environment.Reference;

public class SelectorNode implements ISelector {
	private final List<ISelector> _selectors;

	public SelectorNode(List<ISelector> list) {
		if (list != null){
			_selectors = list;
		} else {
			_selectors = new ArrayList<ISelector>();
		}
	}

	@Override
	public Reference refer(Context context, Reference firstRef) {
		Reference ref = firstRef;
		for (ISelector currentSelector : _selectors) {
			ref = currentSelector.refer(context, ref);
		}
		return ref;
	}

}
