package randy.oberon0.interpreter.runtime;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.value.*;

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
		return Value.makeNew(primitiveType);
	}
}
