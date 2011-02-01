package oberon0.ast.expressions;

import oberon0.environment.Context;

public class BooleanNode implements IEvaluable {
	private boolean _value;
	
	public BooleanNode(boolean value) {
		_value = value;
	}

	@Override
	public Object eval(Context context) {
		System.out.print(_value);
		return _value;
	}

}
