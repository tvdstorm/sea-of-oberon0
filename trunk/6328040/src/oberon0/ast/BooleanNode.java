package oberon0.ast;

import oberon0.environment.Context;

public class BooleanNode implements IEvaluable {
	private boolean _value;
	
	public BooleanNode(boolean value) {
		_value = value;
	}

	@Override
	public Object eval(Context context) {
		return _value;
	}

}
