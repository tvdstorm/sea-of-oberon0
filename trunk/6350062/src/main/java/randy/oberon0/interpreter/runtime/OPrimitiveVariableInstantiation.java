package randy.oberon0.interpreter.runtime;

import randy.oberon0.exception.Oberon0RuntimeException;
import randy.oberon0.value.*;

public class OPrimitiveVariableInstantiation implements OInstantiateableVariable
{
	private Type type;
	
	public OPrimitiveVariableInstantiation(Type _type)
	{
		type = _type;
	}
	@Override
	public OValue instantiate(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		return OValue.makeNew(type);
	}
}
