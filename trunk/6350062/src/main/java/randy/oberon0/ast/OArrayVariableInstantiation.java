package randy.oberon0.ast;

import randy.oberon0.exception.Oberon0RuntimeException;
import randy.oberon0.interpreter.runtime.TypeRegistry;
import randy.oberon0.value.*;

public class OArrayVariableInstantiation implements OInstantiateableVariable
{
	private OInstantiateableVariable childType;
	private int length;
	
	public OArrayVariableInstantiation(OInstantiateableVariable _childType)
	{
		childType = _childType;
		length = 0;
	}
	public void setLength(int _length)
	{
		length = _length;
	}
	@Override
	public OValue instantiate(TypeRegistry _typeRegistry) throws Oberon0RuntimeException
	{
		return new OArray(length, childType, _typeRegistry);
	}
}
