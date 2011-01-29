package randy.oberon0.value;

import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;

public class Array extends Value
{
	private Value values[];
	
	public Array(int _size, IInstantiateableVariable _childType, RuntimeEnvironment environment) throws RuntimeException
	{
		values = new Value[_size];
		for (int i=0;i<_size;i++)
		{
			values[i] = _childType.instantiate(environment);
		}
	}
	public Array(Array _value) throws RuntimeException
	{
		// Copy constructor
		setValue(_value);
	}
	public Value getIndexValue(int _index) throws OutOfBoundsException
	{
		if (_index >= values.length)
			throw new OutOfBoundsException(_index);
		return values[_index];
	}
	public Value dereference()
	{
		return this;
	}
	public void setValue(Value _val) throws RuntimeException
	{
		// Resolve CONST
		Array v = _val.dereference().castToArray();
		values = new Value[v.values.length];
		for (int i=0;i<v.values.length;i++)
		{
			values[i] = Value.makeNew(v.values[i].getType()); // TODO: anders aanpakken i.v.m. RECORDS en POINTER TO
		}
	}
	public Type getType()
	{
		return Type.ARRAY;
	}
	public int getLength()
	{
		return values.length;
	}
	@Override
	public String toString()
	{
		String ret = "[";
		for (Value val : values)
		{
			ret += val.toString() + ",";
		}
		ret += "]";
		return ret;
	}
}
