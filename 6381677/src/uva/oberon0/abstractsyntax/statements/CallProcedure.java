package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.runtime.Scope;

/**
 * @author Chiel Labee
 * This class represents the default Method Call.
 * This implementation will execute the Method Call based on the specified Identifier using the relevant Execution Scope.
*/
public class CallProcedure extends Call 
{
	public CallProcedure(ID procedureID)
	{
		_procedureID = procedureID;
	}
	
	private ID _procedureID = null;
	
	@Override
	public int eval(Scope scope) {
		return scope.callProcedure(_procedureID, getCallVars());
	}
}
