package jdm.oberon0.interpreter;

import jdm.oberon0.builtins.BuiltinProcedure;
import jdm.oberon0.types.Type;
import jdm.oberon0.values.Value;

public abstract class Scope {
	protected Scope _parentScope;

	public abstract void defineType(String name, Type type);
	public abstract void defineConstant(String name, Value value);	
	public abstract void defineProcedure(String name, BuiltinProcedure value);

	public Scope getParentScope() {
		return _parentScope;
	}

	public boolean isGlobalScope() {
		return (_parentScope == null);
	}
}
