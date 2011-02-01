package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.runtime.Scope;

/**
 * @author Chiel Labee
 * This class represents a specially build-in Assert Method Call.
 * This class is designed for testing purposes.
*/
public class CallConcreteAssert extends CallConcrete 
{
	public CallConcreteAssert(boolean resultType)
	{
		_resultType = resultType;
	}

	private boolean _resultType = true;
	
	@Override
	public int eval(Scope scope) 
	{
		return getCallVar(0).eval(scope) == 1 ? _resultType == true ? 1 : 0 : _resultType == false ? 1 : 0; 
	}

}
