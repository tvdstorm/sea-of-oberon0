package randy.oberon0.interpreter.runtime;

import randy.oberon0.exception.Oberon0RuntimeException;
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
	public OValue instantiate(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		return new OArray(length, childType, environment);
	}
}
