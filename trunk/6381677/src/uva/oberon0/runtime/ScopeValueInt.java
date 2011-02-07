package uva.oberon0.runtime;

import uva.oberon0.abstractsyntax.BaseNode;

/**
 * @author Chiel Labee This class represents an Integer based Execution Scope
 *         Value.
 */
public class ScopeValueInt extends ScopeValue {
	private int _value;

	public ScopeValueInt() {
		_value = 0;
	}

	public ScopeValueInt(int value) {
		_value = value;
	}

	public int getValue() {
		return _value;
	}

	public void setValue(int valueNew) {
		_value = valueNew;
	}

	@Override
	public ScopeValue getValueBySelector(Scope scope, BaseNode selector) {
		assert false : "Unsupported Selector Search.";
		return null;
	}
}
