package runtime.builtins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int value = 0;
			try {
				value = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ref.setValue(new IntegerValue(value)); //XXX
		} else {
			//XXX
		}
	}
}
