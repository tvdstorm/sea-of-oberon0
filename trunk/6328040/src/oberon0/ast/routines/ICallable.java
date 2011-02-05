package oberon0.ast.routines;

import java.util.ArrayList;

import oberon0.ast.IASTNode;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;

/*
 *  Interface for Routines (Procedures and Module)
 *  makes sure they implement a call-method
 */
public interface ICallable extends IASTNode{
	/*
	 * to increase readability, use this instead of 'null'
	 */
	public final static ArrayList<IReferable> noActualParameters = null;
	
	/*
	 * call the routine
	 */
	public void call(Context context,  ArrayList<IReferable> actualParameters);
}
