package oberon0.environment.builtinroutines;

import java.util.List;
import java.util.Random;

import oberon0.ast.routines.ICallable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;
import oberon0.environment.IntegerValue;
import oberon0.environment.Reference;

/*
 * Behaves like the built in routine "Read" from oberon-0
 * when called, it reads a random number instead of reading one from user input
 */
public class ReadRandom implements ICallable {

	@Override
	/*
	 * Generates a random number (0-9) and returns it to the first reference in
	 * actual parameters
	 */
	public void call(Context context, List<IReferable> actualParameters) {
		// generate a random number
		Random random = new Random();
		int val = random.nextInt(10);

		// wrap the random number
		IntegerValue value = new IntegerValue(val);

		// get the reference from actual parameter
		IReferable actualParam = actualParameters.get(0);
		Reference ref = actualParam.deref(context, Reference.EMPTY_REFERENCE);

		// update the reference with the random number
		ref.setValue(value);
	}

}
