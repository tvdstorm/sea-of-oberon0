package randy.oberon0.interpreter.runtime.environment;

import randy.oberon0.exception.ConstAssignmentException;
import randy.oberon0.value.Value;

public class Reference implements IBindableValue
{
	private Value value;
	
	public Reference(Value _value)
	{
		assert(_value != null);
		value = _value;
	}
	public void setValue(Value _value) throws ConstAssignmentException
	{
		assert(_value != null);
		value = _value;
	}
	public Value getValue()
	{
		return value;
	}
}
