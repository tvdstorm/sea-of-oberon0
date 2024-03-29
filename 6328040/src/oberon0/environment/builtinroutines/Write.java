package oberon0.environment.builtinroutines;

import java.util.List;

import oberon0.ast.expressions.IEvaluable;
import oberon0.ast.routines.ICallable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;
import oberon0.environment.IValue;

/*
 * Built in routine from oberon-0
 * when called, it write the value of the first actual parameter to the console
 */
public class Write implements ICallable {

	@Override
	public void call(Context context, List<IReferable> actualParameters) {
		IEvaluable param = actualParameters.get(0);
		IValue value = param.eval(context);
		System.out.print(value.toString() + " ");
	}

}
