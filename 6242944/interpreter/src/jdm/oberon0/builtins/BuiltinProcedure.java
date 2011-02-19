package jdm.oberon0.builtins;

import jdm.oberon0.interpreter.Callable;
import jdm.oberon0.types.ProcedureType;

public abstract class BuiltinProcedure implements Callable {
	// argument types expected by this procedure
	public abstract ProcedureType getType();
}
