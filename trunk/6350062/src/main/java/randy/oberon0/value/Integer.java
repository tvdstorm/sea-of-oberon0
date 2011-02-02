package randy.oberon0.value;

import randy.oberon0.exception.RuntimeException;

public class Integer extends Value
{
	private int value;
	
	public Integer(int _value)
	{
		value = _value;
	}
	public Integer(Integer _value) throws RuntimeException
	{
		// Copy constructor
		setValue(_value);
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
			return false;
		return ((Integer)_value).value == value;
	}
}
