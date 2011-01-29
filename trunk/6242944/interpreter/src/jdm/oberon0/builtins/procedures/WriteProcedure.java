package jdm.oberon0.builtins.procedures;

import jdm.oberon0.builtins.BuiltinProcedure;
import jdm.oberon0.interpreter.Context;
import jdm.oberon0.values.Value;

public class WriteProcedure extends BuiltinProcedure {

	@Override
	public void execute(Context ctx, Value[] arguments) {
		System.out.print(arguments[0].toNativeString());
	}

	@Override
	public int getArgumentCount() {
		return 1;
	}
}
