package runtime;

import interpreter.Context;

public class Read extends BuiltinFunction {

	@Override
	public Value execute(Context ctx, Value[] arguments) {
		return ctx.getVoid(); //FIXME
	}

	
}
