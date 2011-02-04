package oberon0.ast.routines.parameters;

import java.util.ArrayList;

import oberon0.ast.expressions.IEvaluable;

public abstract class BaseFormalParameterNode implements IFormalParameter{
	protected ArrayList<String> _names;
	protected IEvaluable _type;
	
	protected BaseFormalParameterNode(ArrayList<String> names, IEvaluable type) {
		_names = names;
		_type = type;
	}
}
