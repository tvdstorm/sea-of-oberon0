package oberon0.ast.routines;

import java.util.Collections;
import java.util.List;

import oberon0.ast.IASTNode;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;

/*
 *  Interface for Routines (Procedures and Module)
 *  makes sure they implement a call-method
 */
public interface ICallable extends IASTNode {
	/*
	 * to increase readability, use this instead of 'null'
	 */
	public final static List<IReferable> EMPTY_ACTUALPARAMETERS = Collections
			.emptyList();

	/*
	 * call the routine
	 */
	public void call(Context context, List<IReferable> actualParameters);
}
