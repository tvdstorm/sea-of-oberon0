package uva.oberon0.abstractsyntax.types;

import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.ScopeValue;
import uva.oberon0.runtime.ScopeValueInt;


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
	public ScopeValue instantiate(Scope scope) {
		return new ScopeValueInt(scope);
	}

}
