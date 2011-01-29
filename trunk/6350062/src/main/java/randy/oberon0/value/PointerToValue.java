package randy.oberon0.value;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;

public class PointerToValue extends Value
{
	private IInstantiateableVariable variableCreator;
	private Value pointsTo;
	
	public PointerToValue(IInstantiateableVariable _variableCreator)
	{
		variableCreator = _variableCreator;
	}
	public boolean isNill()
	{
		return (pointsTo == null);
	}
	public void invokeNew(RuntimeEnvironment environment) throws RuntimeException
	{
		pointsTo = variableCreator.instantiate(environment);
	}
	@Override
	public Value dereference()
	{
		assert(!isNill());
		return pointsTo.dereference();
	}
	@Override
	public void setValue(Value _val) throws RuntimeException
	{
		if (_val instanceof NilValue)
			pointsTo = null;
		else if (_val instanceof PointerToValue && ((PointerToValue)_val).isNill())
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
