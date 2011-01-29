package jdm.oberon0.builtins.procedures;

import jdm.oberon0.builtins.BuiltinProcedure;
import jdm.oberon0.interpreter.Context;
import jdm.oberon0.values.Value;

public class WriteLnProcedure extends BuiltinProcedure {

	@Override
	public void execute(Context ctx, Value[] arguments) {
		System.out.println("");
	}
	
	@Override
	public int getArgumentCount() {
		return 0;
	}
}
