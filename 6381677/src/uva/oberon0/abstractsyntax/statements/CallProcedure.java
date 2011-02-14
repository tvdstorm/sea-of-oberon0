package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.declarations.Procedure;
import uva.oberon0.abstractsyntax.expressions.ExpressionList;
import uva.oberon0.abstractsyntax.types.BaseType;
import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.runtime.Scope;

/**
 * @author Chiel Labee
 * This class represents the default Method Call.
 * This implementation will execute the Method Call based on the specified Identifier using the relevant Execution Scope.
*/
public class CallProcedure extends Call 
{
	public CallProcedure(ExpressionList actualParameterList, ID procedureID)
	{
		super(actualParameterList);
		
		assert procedureID != null 		: "No Identifier is available for the current Method Call Statement!";

		_procedureID = procedureID;
	}
	
	private ID _procedureID = null;
	
	@Override
	public int eval(Scope scope) {
		return scope.callProcedure(_procedureID, getActualParameterList());
	}

	@Override
	public boolean checkTypes(Scope scope) {
		Procedure procedure = (Procedure)scope.getBindable(_procedureID);
		
		if (procedure == null) {
			return false;
		}
		
		if (procedure.getParameterCount() != getActualParameterCount()) {
			return false;
		}
		
		for (int i = 0; i < getActualParameterCount(); i++) {
			BaseType actualType = getActualParameter(i).getType();
			BaseType formalType = procedure.getParameter(i).getType();
			
			if (actualType.getClass() != formalType.getClass()) {
				return false;
			}
		}
		
		return true;
	}
}
