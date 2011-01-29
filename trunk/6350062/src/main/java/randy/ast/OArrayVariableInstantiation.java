package randy.ast;

import randy.exception.Oberon0RuntimeException;
import randy.interpreter.preprocess.TypeRegistry;
import randy.value.*;

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
