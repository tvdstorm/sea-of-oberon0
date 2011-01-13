package randy.value;

import randy.ast.Type;
import randy.exception.Oberon0TypeMismatchException;

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
	public OValue dereference()
	{
		return this;
	}
	/*public void setValue(boolean _value)
	{
		value = _value;
	}*/
	public void setValue(OValue _val) throws Oberon0TypeMismatchException
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
