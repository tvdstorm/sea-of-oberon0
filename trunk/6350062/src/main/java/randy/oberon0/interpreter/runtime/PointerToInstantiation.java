package randy.oberon0.interpreter.runtime;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.value.*;

public class PointerToInstantiation implements IInstantiateableVariable
{
	private String pointsTo;
	
	public PointerToInstantiation(String _pointsTo)
	{
		pointsTo = _pointsTo;
	}
	@Override
	public Value instantiate(RuntimeEnvironment environment) throws RuntimeException
	{
		return new PointerToValue(environment.resolveType(pointsTo));
	}
}
