package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.expressions.ExpressionList;
import uva.oberon0.runtime.Scope;

/**
 * @author Chiel Labee
 * This class represents the build-in Write Line Method Call.
*/
public class CallWriteLn extends Call 
{
	public CallWriteLn(ExpressionList actualParameterList)
	{
		super(actualParameterList);
	}
	
	@Override
	public int eval(Scope scope) 
	{
		System.out.println();
		return 1;
	}
	
	@Override
	public boolean checkTypes(Scope scope) {
		return true;
	}
}
