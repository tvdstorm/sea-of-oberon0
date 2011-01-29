package randy.oberon0.ast;

import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.*;

public class OBooleanLiteral extends OExpression
{
	private OBoolean value;
	
	public OBooleanLiteral(OBoolean _value)
	{
		assert(_value != null);
		value = _value;
	}
	@Override
	public OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		assert(environment != null);
		// Return the boolean value
		return value;
	}
}
