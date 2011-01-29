package randy.oberon0.ast;

import randy.oberon0.exception.Oberon0RuntimeException;
import randy.oberon0.interpreter.runtime.TypeRegistry;
import randy.oberon0.value.OValue;
import randy.oberon0.value.Type;

public class OPrimitiveVariableInstantiation implements OInstantiateableVariable
{
	private Type type;
	
	public OPrimitiveVariableInstantiation(Type _type)
	{
		type = _type;
	}
	@Override
	public OValue instantiate(TypeRegistry _typeRegistry) throws Oberon0RuntimeException
	{
		return OValue.makeNew(type);
	}
}
