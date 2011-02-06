package randy.oberon0.value;

import randy.oberon0.exception.TypeMismatchException;
import randy.oberon0.exception.RuntimeException;

public class Integer extends Value
{
	private int value;
	
	public Integer(int _value)
	{
		value = _value;
	}
	public Integer(boolean _value)
	{
		if (_value)
		{
			value = 1;
		}
		else
		{
			value = 0;
		}
	}
	public int getIntValue()
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
		Integer v = _val.dereference().castToInteger();
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
		_value = _value.dereference();
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
	public boolean isTrue() throws TypeMismatchException
	{
		if (value == 0)
		{
			return false;
		}
		else if (value == 1)
		{
			return true;
		}
		else
		{
			throw new TypeMismatchException("INTEGER", "BOOLEAN");
		}
	}
}
