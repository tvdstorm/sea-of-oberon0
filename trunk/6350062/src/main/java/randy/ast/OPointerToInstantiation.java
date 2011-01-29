package randy.ast;

import randy.exception.Oberon0RuntimeException;
import randy.interpreter.preprocess.TypeRegistry;
import randy.value.*;

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
