package randy.oberon0.interpreter.runtime;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.value.*;

public class ArrayVariableInstantiation implements IInstantiateableVariable
{
	private IInstantiateableVariable childType;
	private int length;
	
	public ArrayVariableInstantiation(IInstantiateableVariable _childType)
	{
		childType = _childType;
		length = 0;
	}
	public void setLength(int _length)
	{
		length = _length;
	}
	@Override
	public Value instantiate(RuntimeEnvironment environment) throws RuntimeException
	{
		return new Array(length, childType, environment);
	}
}
