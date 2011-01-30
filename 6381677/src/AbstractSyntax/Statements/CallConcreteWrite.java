package AbstractSyntax.Statements;

import Execution.Scope;

/**
 * @author Chiel Labee
 * This class represents the build-in Write Method Call.
*/
public class CallConcreteWrite extends CallConcrete 
{
	@Override
	public int eval(Scope scope) {
		System.out.print("Write:" + getCallVar(0).eval(scope));
		return 1;
	}
}
