package randy.oberon0.interpreter.runtime;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.value.*;

public class PrimitiveVariableInstantiation implements IInstantiateableVariable
{
	private Type type;
	
	public PrimitiveVariableInstantiation(Type _type)
	{
		type = _type;
	}
	@Override
	public Value instantiate(RuntimeEnvironment environment) throws RuntimeException
	{
		return Value.makeNew(type);
	}
}
