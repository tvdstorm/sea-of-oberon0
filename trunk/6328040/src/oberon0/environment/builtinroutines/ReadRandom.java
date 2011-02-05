package oberon0.environment.builtinroutines;

import java.util.ArrayList;
import java.util.Random;

import oberon0.ast.routines.ICallable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;
import oberon0.environment.IntegerValue;
import oberon0.environment.Reference;

public class ReadRandom implements ICallable{

	@Override
	public void call(Context context, ArrayList<IReferable> actualParameters) {
		IReferable actualParam = actualParameters.get(0);
		
		Reference ref= actualParam.refer(context, IReferable.noPreviousReference);
		
		
		Random random = new Random();
		int val = random.nextInt(10);
		
		

		IntegerValue value = new IntegerValue(val);
		
		ref.setValue(value);
	}

}
