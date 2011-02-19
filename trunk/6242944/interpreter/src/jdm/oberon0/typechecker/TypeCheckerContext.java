package jdm.oberon0.typechecker;

import jdm.oberon0.interpreter.Context;


public class TypeCheckerContext extends Context {
	public TypeCheckerContext() {
		_scope = new TypeScope();
	}
	
	public TypeScope getScope() {
		return (TypeScope)_scope;
	}

	public void pushScope() {
		_scope = new TypeScope((TypeScope)_scope);
	}
}
