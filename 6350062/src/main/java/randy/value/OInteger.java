package randy.value;

import randy.exception.*;

public class OInteger extends OValue
{
	private int value;
	
	public OInteger(int _value)
	{
		value = _value;
	}
	public OInteger(OInteger _value) throws Oberon0RuntimeException
	{
		// Copy constructor
		setValue(_value);
	}
	public int getIntValue()
	{
		return value;
	}
	public OValue dereference()
	{
		return this;
	}
	public void setValue(OValue _val) throws Oberon0RuntimeException
	{
		// Resolve CONST
		OInteger v = _val.dereference().castToInteger();
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
}
