package jdm.oberon0.interpreter;

import jdm.oberon0.values.BooleanValue;
import jdm.oberon0.values.IntegerValue;

public abstract class Context {
	protected Scope _scope;
	
	public Scope getScope() {
		return _scope;
	}

	public BooleanValue wrapBoolean(boolean b) {
		return new BooleanValue(b);
	}
	
	public IntegerValue wrapInteger(int i) {
		return new IntegerValue(i);
	}
	
	public void popScope() {
		_scope = _scope.getParentScope();
	}
}
