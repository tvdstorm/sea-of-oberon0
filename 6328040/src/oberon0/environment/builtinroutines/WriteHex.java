package oberon0.environment.builtinroutines;

import java.util.ArrayList;

import oberon0.ast.routines.ICallable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;
import oberon0.environment.IntegerValue;

public class WriteHex implements ICallable {

	@Override
	public void call(Context context, ArrayList<IReferable> actualParameters) {
		IReferable param = actualParameters.get(0);
		IntegerValue value = (IntegerValue) param.refer(context, IReferable.noPreviousReference).getValue();
		int intvalue = value.getValue();
		System.out.println("i is hex " + Integer.toHexString(intvalue) );
		
	}

}
