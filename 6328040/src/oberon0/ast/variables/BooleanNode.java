package oberon0.ast.variables;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.BooleanValue;
import oberon0.environment.Context;
import oberon0.environment.IValue;

public class BooleanNode implements IEvaluable {
	private final boolean _value;

	public BooleanNode(boolean value) {
		_value = value;
	}

	@Override
	public IValue eval(Context context) {
		return new BooleanValue(_value);
	}
}
