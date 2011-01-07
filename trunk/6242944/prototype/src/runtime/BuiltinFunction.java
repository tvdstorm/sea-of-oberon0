package runtime;

import interpreter.Context;


public abstract class BuiltinFunction {

	public abstract void execute(Context ctx, Value[] arguments);
}
