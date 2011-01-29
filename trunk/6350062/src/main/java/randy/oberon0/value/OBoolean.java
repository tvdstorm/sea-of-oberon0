package randy.oberon0.value;

import randy.oberon0.exception.*;

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
		OBoolean v = _val.dereference().castToBoolean();
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
}
