package oberon0.environment.builtinroutines;

import java.util.ArrayList;

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
	public void call(Context context, ArrayList<IReferable> actualParameters) {
		IReferable param = actualParameters.get(0);
		IntegerValue value = (IntegerValue) param.refer(context, IReferable.noPreviousReference).getValue();
		int intvalue = value.getValue();
		System.out.println("i is hex " + Integer.toHexString(intvalue) );
		
	}

}
