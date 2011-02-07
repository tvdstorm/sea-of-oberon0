package oberon0.ast.variables;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.IntegerValue;

public class IntegerNode implements IEvaluable{
	private int _value;
	
	public IntegerNode(int parseInt) {
		_value = parseInt;
	}

	@Override
	public IValue eval(Context context) {
		return new IntegerValue(_value);
	}
}
