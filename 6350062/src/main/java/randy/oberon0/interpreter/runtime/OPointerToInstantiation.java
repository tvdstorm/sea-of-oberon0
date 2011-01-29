package randy.oberon0.interpreter.runtime;

import randy.oberon0.exception.Oberon0RuntimeException;
import randy.oberon0.value.*;

public class OPointerToInstantiation implements OInstantiateableVariable
{
	private String pointsTo;
	
	public OPointerToInstantiation(String _pointsTo)
	{
		pointsTo = _pointsTo;
	}
	@Override
	public OValue instantiate(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		return new OPointerToValue(environment.resolveType(pointsTo));
	}
}
