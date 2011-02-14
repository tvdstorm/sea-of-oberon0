package uva.oberon0.runtime.values;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.types.BaseType;
import uva.oberon0.abstractsyntax.types.BooleanType;
import uva.oberon0.abstractsyntax.types.ITypeCheckable;
import uva.oberon0.runtime.Scope;

public class BooleanValue extends Value implements ITypeCheckable {

	private boolean _value;

	public BooleanValue() {
		this(false);
	}
	public BooleanValue(boolean value) {
		_value = value;
	}

	public boolean getValue() {
		return _value;
	}

	public void setValue(boolean valueNew) {
		_value = valueNew;
	}
	
	@Override
	public Value getValueBySelector(Scope scope, BaseNode selector) {
		return null;
	}
	@Override
	public BaseType getType() {
		return new BooleanType();
	}

}
