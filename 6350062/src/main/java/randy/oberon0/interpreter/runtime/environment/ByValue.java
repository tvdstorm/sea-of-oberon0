package randy.oberon0.interpreter.runtime.environment;

import randy.oberon0.value.Value;

public class ByValue implements IBindableValue
{
	private final Value value;
	
	public ByValue(Value _value)
	{
		assert(_value != null);
		value = _value;
	}
	public Value getValue()
	{
		return value;
	}
	@Override
	public String toString()
	{
		return value.toString();
	}
}
