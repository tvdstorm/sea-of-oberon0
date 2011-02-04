package oberon0.environment.builtinroutines;

import java.util.ArrayList;

import oberon0.ast.routines.ICallable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;
import oberon0.environment.IValue;
public class Write implements ICallable {

	@Override
	public void call(Context context, ArrayList<IReferable> actualParameters) {
		IReferable param = actualParameters.get(0);
		IValue value = param.refer(context, IReferable.noPreviousReference).getValue();
		System.out.print(value.toString());
	}

}
