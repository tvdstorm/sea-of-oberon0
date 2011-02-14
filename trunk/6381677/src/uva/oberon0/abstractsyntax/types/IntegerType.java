package uva.oberon0.abstractsyntax.types;

import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.values.Value;
import uva.oberon0.runtime.values.IntegerValue;

/**
 * @author Chiel Labee This class represents an Integer Value Type.
 */
public class IntegerType extends BaseType 
{
	public IntegerType() {
	}

	@Override
	public Value instantiate(Scope scope) {
		return new IntegerValue();
	}

}
