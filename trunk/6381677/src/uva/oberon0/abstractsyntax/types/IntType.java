package uva.oberon0.abstractsyntax.types;

import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.Value;
import uva.oberon0.runtime.ValueInt;

/**
 * @author Chiel Labee This class represents an Integer Value Type.
 */
public class IntType extends BaseType 
{
	public IntType() {
	}

	@Override
	public Value instantiate(Scope scope) {
		return new ValueInt();
	}

}
