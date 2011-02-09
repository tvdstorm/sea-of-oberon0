package randy.oberon0.interpreter.runtime.environment;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.RuntimeEnvironment;
import randy.oberon0.value.*;

public class ArrayVariableInstantiation implements IInstantiateableVariable
{
	private IInstantiateableVariable childTypeCreator;
	private int arrayLength;
	
	public ArrayVariableInstantiation(IInstantiateableVariable _childTypeCreator)
	{
		childTypeCreator = _childTypeCreator;
		arrayLength = 0;
	}
	public void setLength(int _arrayLength)
	{
		arrayLength = _arrayLength;
	}
	@Override
	public Value instantiate(RuntimeEnvironment environment) throws RuntimeException
	{
		return new Array(arrayLength, childTypeCreator, environment);
	}
}
