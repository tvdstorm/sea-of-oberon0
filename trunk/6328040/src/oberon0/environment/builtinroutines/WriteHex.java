package oberon0.environment.builtinroutines;

import java.util.List;

import oberon0.ast.expressions.IEvaluable;
import oberon0.ast.routines.ICallable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;
import oberon0.environment.IntegerValue;

/*
 * Built in routine from oberon-0
 * when called, it write the hexadecimal value of the first actual parameter to the console
 */
public class WriteHex implements ICallable {

	@Override
	public void call(Context context, List<IReferable> actualParameters) {
		IEvaluable param = actualParameters.get(0);
		IntegerValue value = (IntegerValue) param.eval(context);
		int intvalue = value.getValue();
		System.out.print("i is hex " + Integer.toHexString(intvalue));
	}

}
