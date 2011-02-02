package oberon0.ast.expressions;

import oberon0.ast.IASTNode;
import oberon0.environment.Context;
import oberon0.environment.IValue;


public class VariableNode implements IEvaluable {

	String _name;
	
	public VariableNode(String name, IASTNode selector) {
		_name = name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public IValue eval(Context context) {
		// TODO Auto-generated method stub
		return context.get(_name).getValue();
	}

}
