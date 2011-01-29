package randy.oberon0.value;

import randy.oberon0.exception.Oberon0RuntimeException;
import randy.oberon0.interpreter.runtime.*;

public class OPointerToValue extends OValue
{
	private OInstantiateableVariable variableCreator;
	private OValue pointsTo;
	
	public OPointerToValue(OInstantiateableVariable _variableCreator)
	{
		variableCreator = _variableCreator;
	}
	public boolean isNill()
	{
		return (pointsTo == null);
	}
	public void invokeNew(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		pointsTo = variableCreator.instantiate(environment);
	}
	@Override
	public OValue dereference()
	{
		assert(!isNill());
		return pointsTo.dereference();
	}
	@Override
	public void setValue(OValue _val) throws Oberon0RuntimeException
	{
		if (_val instanceof ONilValue)
			pointsTo = null;
		else if (_val instanceof OPointerToValue && ((OPointerToValue)_val).isNill())
			pointsTo = null;
		else
			pointsTo = _val.dereference();
	}
	@Override
	public Type getType()
	{
		return Type.POINTERTO;
	}
	@Override
	public String toString()
	{
		return Type.POINTERTO.getTypeText();
	}
}
