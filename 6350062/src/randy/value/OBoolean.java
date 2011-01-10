package randy.value;

import randy.ast.Type;
import randy.exception.Oberon0Exception; 

public class OBoolean extends OValue
{
	private boolean value;
	
	public OBoolean(boolean _value)
	{
		value = _value;
	}
	public OBoolean(OBoolean _value)
	{
		// Copy constructor
		value = _value.value;
	}
	public boolean getBoolValue()
	{
		return value;
	}
	public OValue getValue()
	{
		return this;
	}
	public void setValue(boolean _value)
	{
		value = _value;
	}
	public void setValue(OValue _val) throws Oberon0Exception
	{
		// Resolve CONST
		_val = _val.getValue();
		if (_val instanceof OBoolean)
		{
			OBoolean v = (OBoolean)_val;
			this.value = v.value;
		}
		else
			throw new Oberon0Exception("Can't set value on another type...");
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
