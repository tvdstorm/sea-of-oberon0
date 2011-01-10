package runtime.builtins;

import runtime.BuiltinFunction;
import runtime.IntegerValue;
import runtime.Value;
import runtime.ValueRef;
import interpreter.Context;

public class Read extends BuiltinFunction {

	@Override
	public void execute(Context ctx, Value[] arguments) {
		if (arguments.length == 1 && arguments[0] instanceof ValueRef) {
			ValueRef ref = (ValueRef)arguments[0];
			ref.setValue(new IntegerValue(100)); //XXX
		} else {
			//XXX
		}
	}
}
