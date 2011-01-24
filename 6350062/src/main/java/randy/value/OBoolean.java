package randy.value;

import randy.exception.*;

public class OBoolean extends OValue
{
	private boolean value;
	
	public OBoolean(boolean _value)
	{
		value = _value;
	}
	public OBoolean(OBoolean _value) throws Oberon0RuntimeException
	{
		// Copy constructor
		setValue(_value);
	}
	public boolean getBoolValue()
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
		_val = _val.dereference();
		if (_val instanceof OBoolean)
		{
			OBoolean v = (OBoolean)_val;
			this.value = v.value;
		}
		else
			throw new Oberon0TypeMismatchException(_val.getType(), getType());
	}
	public Type getType()
	{
		return Type.BOOL;
	}
	@Override
	public String toString()
	{
		return "" + value;
	}
}
