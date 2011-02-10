package randy.oberon0.interpreter.runtime.environment;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.UnreachableRuntimeException;
import randy.oberon0.value.*;
import randy.oberon0.value.Boolean;
import randy.oberon0.value.Integer;

public class PrimitiveVariableInstantiation implements IInstantiateableVariable
{
	private Type primitiveType;
	
	public PrimitiveVariableInstantiation(Type _primitiveType)
	{
		primitiveType = _primitiveType;
	}
	@Override
	public Value instantiate(RuntimeEnvironment environment) throws RuntimeException
	{
		if (primitiveType == Type.INTEGER)
		{
			return new Integer(0);
		}
		else if (primitiveType == Type.BOOLEAN)
		{
			return new Boolean(false);
		}
		else
		{
			throw new UnreachableRuntimeException();
		}
	}
}
