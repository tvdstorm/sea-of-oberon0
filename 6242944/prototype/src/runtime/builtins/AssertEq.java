package runtime.builtins;

import runtime.BuiltinFunction;
import runtime.Value;
import interpreter.Context;

public class AssertEq extends BuiltinFunction {

	@Override
	public void execute(Context ctx, Value[] arguments) {
		if (arguments.length != 2) {
			//FIXME!
			return;
		}
		
		Value v1 = arguments[0];
		Value v2 = arguments[1];
		
		if (v1.equals(v2)) {
			System.out.println("OK");
		} else {
			System.out.println("ERROR");			
		}
	}

}
