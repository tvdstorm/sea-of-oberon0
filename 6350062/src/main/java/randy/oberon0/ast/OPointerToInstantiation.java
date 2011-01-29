package randy.oberon0.ast;

import randy.oberon0.exception.Oberon0RuntimeException;
import randy.oberon0.interpreter.runtime.TypeRegistry;
import randy.oberon0.value.*;

public class OPointerToInstantiation implements OInstantiateableVariable
{
	private String pointsTo;
	
	public OPointerToInstantiation(String _pointsTo)
	{
		pointsTo = _pointsTo;
	}
	@Override
	public OValue instantiate(TypeRegistry _typeRegistry) throws Oberon0RuntimeException
	{
		return new OPointerToValue(_typeRegistry.resolve(pointsTo));
	}
}
