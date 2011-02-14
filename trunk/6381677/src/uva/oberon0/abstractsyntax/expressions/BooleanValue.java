package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.types.BooleanType;
import uva.oberon0.runtime.Scope;

public class BooleanValue extends Expression {

	private boolean _value = false;
	
	public BooleanValue(boolean value) {
		super(new BooleanType());
		
		_value = value;
	}

	@Override
	public int eval(Scope scope) {
		return _value ? 1 : 0;
	}

}
