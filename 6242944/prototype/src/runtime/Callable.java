package runtime;

import interpreter.Context;

public abstract class Callable {
	public abstract void execute(Context ctx, Value[] arguments);
}
