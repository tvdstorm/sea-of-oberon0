package AbstractSyntax.Statements;

import AbstractSyntax.ID;
import Execution.Scope;

/**
 * @author Chiel Labee
 * This class represents the default Method Call.
 * This implementation will execute the Method Call based on the specified Identifier using the relevant Execution Scope.
*/
public class CallConcreteDefault extends CallConcrete 
{
	public CallConcreteDefault(ID id) 
	{
		_procedureID = id;
	}

	private ID _procedureID = null;
	
	@Override
	public int eval(Scope scope) {
		return scope.callProcedure(_procedureID, getCallVars());
	}

}
