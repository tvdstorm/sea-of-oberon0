package oberon0.environment.builtinroutines;

import java.util.ArrayList;

import oberon0.ast.routines.ICallable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;

/*
 * writes a new linefeed and carriagereturn to the console
 */
public class WriteLn implements ICallable {

	@Override
	public void call(Context context, ArrayList<IReferable> actualParameters) {
		System.out.print("\n");
	}
}
