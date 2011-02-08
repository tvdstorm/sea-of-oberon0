package oberon0.ast.variables;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.BooleanValue;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.IntegerValue;

public class TypeNode implements IEvaluable {
	private final String _typename;

	public TypeNode(String typename) {
		_typename = typename;
	}

	@Override
	public IValue eval(Context context) {
		if (_typename.equals("INTEGER")) {
			return new IntegerValue(0);
		} else if (_typename.equals("BOOLEAN")) {
			return new BooleanValue(false);
		} else {
			return context.getType(_typename);
		}
	}

}
