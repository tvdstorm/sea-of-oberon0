package randy.value;

import randy.ast.Type;
import randy.exception.Oberon0Exception;

public class OArray extends OValue
{
	// TODO: geschikt maken voor multidimensional arrays
	private OValue values[];
	
	public OArray(int _size, Type _type) throws Oberon0Exception
	{
		values = new OValue[_size];
		for (int i=0;i<_size;i++)
		{
			values[i] = OValue.makeNew(_type);
		}
	}
	public OArray(OArray _value) throws Oberon0Exception
	{
		// Copy constructor
		values = new OValue[_value.values.length];
		for (int i=0;i<_value.values.length;i++)
		{
			values[i] = OValue.makeNew(_value.values[i].getType());
		}
	}
	public OValue getIndexValue(int _index)
	{
		// TODO: check if out of bounds
		return values[_index];
	}
	public OValue getValue()
	{
		return this;
	}
	public void setValue(OValue _val) throws Oberon0Exception
	{
		// TODO: implementeren
		throw new Oberon0Exception("OArray.setValue(OValue)");
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
