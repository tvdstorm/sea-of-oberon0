package randy.value;

import randy.ast.Type;
import randy.exception.*;;

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
	/*public void setValue(int _value)
	{
		value = _value;
	}*/
	public void setValue(OValue _val) throws Oberon0RuntimeException
	{
		// Resolve CONST
		_val = _val.dereference();
		if (_val instanceof OInteger)
		{
			OInteger v = (OInteger)_val;
			this.value = v.value;
		}
		else
			throw new Oberon0TypeMismatchException(_val.getType(), getType());
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
