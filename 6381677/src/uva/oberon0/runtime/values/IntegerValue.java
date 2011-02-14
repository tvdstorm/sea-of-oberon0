package uva.oberon0.runtime.values;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.types.BaseType;
import uva.oberon0.abstractsyntax.types.ITypeCheckable;
import uva.oberon0.abstractsyntax.types.IntegerType;
import uva.oberon0.runtime.Scope;

/**
 * @author Chiel Labee This class represents an Integer based Execution Scope
 *         Value.
 */
public class IntegerValue extends Value implements ITypeCheckable
{
	private int _value;

	public IntegerValue() {
		_value = 0;
	}

	public IntegerValue(int value) {
		_value = value;
	}

	public int getValue() {
		return _value;
	}

	public void setValue(int valueNew) {
		_value = valueNew;
	}

	@Override
	public Value getValueBySelector(Scope scope, BaseNode selector) {
		assert false : "Unsupported Selector Search.";
		return null;
	}

	@Override
	public BaseType getType() {
		return new IntegerType();
	}
}
