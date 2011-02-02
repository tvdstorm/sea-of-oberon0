package oberon0.ast.variables;

import java.util.ArrayList;

import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.Reference;

public class SelectorNode implements ISelector{
	ArrayList<ISelector> _selectors;
	
	public SelectorNode(ArrayList<ISelector> selectors) {
		_selectors = selectors;
	}

	@Override
	public IValue eval(Context context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reference refer(Context context, Reference firstRef) {
		Reference ref = firstRef;
		for(ISelector currentSelector : _selectors){
			ref = currentSelector.refer(context, ref);
		}
		return ref;
	}

}
