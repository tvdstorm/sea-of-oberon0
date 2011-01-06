package runtime;

import interpreter.Context;

public class Write extends BuiltinFunction {

	@Override
	public Value execute(Context ctx, Value[] arguments) {
		for(Value v : arguments) {
			System.out.println(v.toNativeString());
		}
		return ctx.getVoid();
	}

}
