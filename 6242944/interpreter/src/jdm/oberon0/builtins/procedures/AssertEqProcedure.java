package jdm.oberon0.builtins.procedures;

import jdm.oberon0.builtins.BuiltinProcedure;
import jdm.oberon0.exceptions.AssertionFailureException;
import jdm.oberon0.interpreter.Context;
import jdm.oberon0.values.Value;

public class AssertEqProcedure extends BuiltinProcedure {

	@Override
	public void execute(Context ctx, Value[] arguments) {
		Value v1 = arguments[0];
		Value v2 = arguments[1];
		
		if (!v1.valueEquals(v2)) {
			throw new AssertionFailureException(v1.toNativeString(), v2.toNativeString());
		}
	}

	@Override
	public int getArgumentCount() {
		return 2;
	}
}
