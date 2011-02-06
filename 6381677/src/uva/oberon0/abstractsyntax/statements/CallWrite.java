package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.expressions.ExpressionList;
import uva.oberon0.runtime.Scope;

/**
 * @author Chiel Labee
 * This class represents the build-in Write Method Call.
*/
public class CallWrite extends Call 
{
	public CallWrite(ExpressionList actualParameterList)
	{
		super(actualParameterList);
	}
	
	@Override
	public int eval(Scope scope) 
	{
		System.out.print("Write:" + getActualParameter(0).eval(scope));
		return 1;
	}
}
