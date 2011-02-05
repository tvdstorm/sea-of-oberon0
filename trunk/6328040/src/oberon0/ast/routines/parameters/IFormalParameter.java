package oberon0.ast.routines.parameters;

import java.util.ArrayList;

import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;

/*
 * Makes sure a formal parameter can be filled in
 */
public interface IFormalParameter {
	/*
	 * Fills in the given actual parameters in the formal parameters 
	 * and declare them in the given context
	 */
	public void fillIn(Context context, ArrayList<IReferable> _actualParams);

}
