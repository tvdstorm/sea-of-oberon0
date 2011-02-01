package oberon0.ast;

import oberon0.environment.Context;

public class IntegerNode implements IEvaluable {
	private int _value;
	
	public IntegerNode(int parseInt) {
		_value = parseInt;
	}

	@Override
	public Object eval(Context context) {
		return _value;
	}
}
