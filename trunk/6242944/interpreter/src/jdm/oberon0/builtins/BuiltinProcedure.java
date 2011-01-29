package jdm.oberon0.builtins;

import jdm.oberon0.interpreter.Callable;

public abstract class BuiltinProcedure implements Callable {
	
	// Number of arguments expected by this procedure.
	public abstract int getArgumentCount();
}
