package runtime.builtins;

import runtime.BuiltinFunction;
import runtime.Value;
import interpreter.Context;

public class Write extends BuiltinFunction {

	@Override
	public void execute(Context ctx, Value[] arguments) {
		for(Value v : arguments) {
			System.out.print(v.toNativeString());
		}
	}

}
