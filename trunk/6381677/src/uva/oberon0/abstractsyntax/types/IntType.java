package uva.oberon0.abstractsyntax.types;

import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents an Integer Value Type.
*/
public class IntType  extends BaseType
{
	public IntType()
	{
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public int eval(Scope scope) 
	{
		assert false : "Unsupported Eval!";
		return 0;
	}

}
