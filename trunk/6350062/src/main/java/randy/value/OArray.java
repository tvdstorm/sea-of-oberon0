package randy.value;

import randy.exception.*;

public class OArray extends OValue
{
	// TODO: geschikt maken voor multidimensional arrays
	private OValue values[];
	
	public OArray(int _size, Type _type) throws Oberon0RuntimeException
	{
		values = new OValue[_size];
		for (int i=0;i<_size;i++)
		{
			values[i] = OValue.makeNew(_type);
		}
	}
	public OArray(OArray _value) throws Oberon0RuntimeException
	{
		// Copy constructor
		setValue(_value);
	}
	public OValue getIndexValue(int _index)
	{
		// TODO: check if out of bounds
		return values[_index];
	}
	public OValue dereference()
	{
		return this;
	}
	public void setValue(OValue _val) throws Oberon0RuntimeException
	{
		// Resolve CONST
		_val = _val.dereference();
		if (_val instanceof OArray)
		{
			OArray v = (OArray)_val;
			values = new OValue[v.values.length];
			for (int i=0;i<v.values.length;i++)
			{
				values[i] = OValue.makeNew(v.values[i].getType());
			}
		}
		else
			throw new Oberon0TypeMismatchException(_val.getType(), getType());
	}
	public Type getType()
	{
		return Type.ARRAY;
	}
	@Override
	public String toString()
	{
		String ret = "[";
		for (OValue val : values)
		{
			ret += val.toString() + ",";
		}
		ret += "]";
		return ret;
	}
}
