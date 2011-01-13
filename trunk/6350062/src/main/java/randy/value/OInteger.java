package randy.value;

import randy.ast.Type;
import randy.exception.Oberon0Exception;

public class OInteger extends OValue
{
	private int value;
	
	public OInteger(int _value)
	{
		value = _value;
	}
	public OInteger(OInteger _value)
	{
		// Copy constructor
		value = _value.value;
	}
	public int getIntValue()
	{
		return value;
	}
	public OValue dereference()
	{
		return this;
	}
	/*public void setValue(int _value)
	{
		value = _value;
	}*/
	public void setValue(OValue _val) throws Oberon0Exception
	{
		// Resolve CONST
		_val = _val.dereference();
		if (_val instanceof OInteger)
		{
			OInteger v = (OInteger)_val;
			this.value = v.value;
		}
		else
			throw new Oberon0Exception("Can't set value on another type...");
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
