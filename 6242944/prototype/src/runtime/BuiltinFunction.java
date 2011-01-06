package runtime;

import interpreter.Context;


public abstract class BuiltinFunction {

	public abstract Value execute(Context ctx, Value[] arguments);
}
