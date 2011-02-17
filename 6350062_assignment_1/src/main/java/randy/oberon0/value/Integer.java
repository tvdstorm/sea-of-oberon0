package randy.oberon0.value;

import randy.oberon0.exception.RuntimeException;

public class Integer extends Value
{
	private int value;
	
	public Integer(int _value)
	{
		value = _value;
	}
	public int getIntValue()
	{
		return value;
	}
	public void setValue(Value _val) throws RuntimeException
	{
		Integer v = _val.castToInteger();
		this.value = v.value;
	}
	public Type getType()
	{
		return Type.INTEGER;
	}
	@Override
	public String toString()
	{
		return "" + value;
	}
	@Override
	public boolean equalsToValue(Value _value)
	{
		if (!(_value instanceof Integer))
		{
			return false;
		}
		return ((Integer)_value).value == value;
	}
	@Override
	public Value clone()
	{
		return new Integer(value);
	}
}
