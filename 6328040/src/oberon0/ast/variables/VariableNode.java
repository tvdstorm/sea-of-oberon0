package oberon0.ast.variables;

import oberon0.ast.variables.selectors.ISelector;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.Reference;


public class VariableNode implements IReferable{

	String _name;
	ISelector _selector;
	
	public VariableNode(String name, ISelector selec) {
		_name = name;
		_selector = selec;
	}

	@Override
	public IValue eval(Context context) {
		Reference ref= context.getReference(_name);
		ref = _selector.refer(context, ref);
		return ref.getValue();
	}

	@Override
	public Reference refer(Context context, Reference previousReference) {
		Reference ref= context.getReference(_name);
		ref = _selector.refer(context, ref);
		return ref;
	}

}
