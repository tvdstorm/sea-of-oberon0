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
	private Array(int _size)
	{
		values = new Value[_size];
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
			values[i] = v.values[i].clone();
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
		StringBuilder ret = new StringBuilder("[");
		for (Value val : values)
		{
			ret.append(val.toString() + ",");
		}
		ret.append("]");
		return ret.toString();
	}
	@Override
	public boolean equalsToValue(Value _value)
	{
		_value = _value.dereference();
		if (!(_value instanceof Array))
			return false;
		Array other = (Array)_value;
		if (values.length != other.values.length)
			return false;
		for (int i=0;i<values.length;i++)
		{
			if (!values[i].equalsToValue(other.values[i]))
				return false;
		}
		return true;
	}
	@Override
	public Value clone()
	{
		Array array = new Array(values.length);
		for (int i=0;i<values.length;i++)
		{
			array.values[i] = values[i].clone();
		}
		return array;
	}
}
