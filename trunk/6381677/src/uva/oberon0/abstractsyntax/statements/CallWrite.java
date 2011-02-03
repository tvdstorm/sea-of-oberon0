package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.runtime.Scope;

/**
 * @author Chiel Labee
 * This class represents the build-in Write Method Call.
*/
public class CallWrite extends Call 
{
	@Override
	public int eval(Scope scope) 
	{
		System.out.print("Write:" + getCallVar(0).eval(scope));
		return 1;
	}
}
