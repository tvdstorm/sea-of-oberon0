package randy.oberon0.value;

import randy.oberon0.exception.RuntimeException;

public class Boolean extends Value
{
	private boolean value;
	
	public Boolean(boolean _value)
	{
		value = _value;
	}
	public Boolean(Boolean _value) throws RuntimeException
	{
		// Copy constructor
		setValue(_value);
	}
	public boolean getBoolValue()
	{
		return value;
	}
	public Value dereference()
	{
		return this;
	}
	public void setValue(Value _val) throws RuntimeException
	{
		// Resolve CONST
		Boolean v = _val.dereference().castToBoolean();
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
		_value = _value.dereference();
		if (!(_value instanceof Boolean))
			return false;
		return ((Boolean)_value).value == value;
	}
}
