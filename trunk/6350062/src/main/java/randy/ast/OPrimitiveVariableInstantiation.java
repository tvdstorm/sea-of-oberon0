package randy.ast;

import randy.exception.Oberon0RuntimeException;
import randy.interpreter.preprocess.TypeRegistry;
import randy.value.OValue;
import randy.value.Type;

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
