package AbstractSyntax.Statements;

import Execution.Scope;

/**
 * @author Chiel Labee
 * This class represents the build-in Write Line Method Call.
*/
public class CallConcreteWriteLn extends CallConcrete 
{
	@Override
	public int eval(Scope scope) {
		System.out.println();
		return 1;
	}
}
