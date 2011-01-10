package runtime.builtins;

import runtime.BuiltinFunction;
import runtime.Value;
import interpreter.Context;

public class WriteLn extends BuiltinFunction {

	@Override
	public void execute(Context ctx, Value[] arguments) {
		System.out.println("");
	}
}
