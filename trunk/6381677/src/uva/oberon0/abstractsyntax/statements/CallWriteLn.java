package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.runtime.Scope;

/**
 * @author Chiel Labee
 * This class represents the build-in Write Line Method Call.
*/
public class CallWriteLn extends Call 
{
	@Override
	public int eval(Scope scope) 
	{
		System.out.println();
		return 1;
	}
}
