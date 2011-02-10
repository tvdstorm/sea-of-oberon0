package randy.oberon0.value;

import randy.oberon0.exception.RuntimeException;

public class Boolean extends Value
{
	private boolean value;
	
	public Boolean(boolean _value)
	{
		value = _value;
	}
	public boolean getBoolValue()
	{
		return value;
	}
	public void setValue(Value _val) throws RuntimeException
	{
		Boolean v = (Boolean)_val;
		this.value = v.value;
	}
	public Type getType()
	{
		return Type.BOOLEAN;
	}
	@Override
	public String toString()
	{
		return "" + value;
	}
	@Override
	public boolean equalsToValue(Value _value)
	{
		if (!(_value instanceof Boolean))
		{
			return false;
		}
		return ((Boolean)_value).value == value;
	}
	@Override
	public Value clone()
	{
		return new Boolean(value);
	}
}
