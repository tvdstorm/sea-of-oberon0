package randy.oberon0.value;

import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;

public class Array extends Value
{
	private Reference values[];
	
	public Array(int _size, IInstantiateableVariable _childType, RuntimeEnvironment environment) throws RuntimeException
	{
		values = new Reference[_size];
		for (int i=0;i<_size;i++)
		{
			values[i] = new Reference(_childType.instantiate(environment));
		}
	}
	private Array(int _size)
	{
		values = new Reference[_size];
	}
	public Reference getIndexValue(int _index) throws OutOfBoundsException
	{
		if (_index >= values.length)
		{
			throw new OutOfBoundsException(_index);
		}
		return values[_index];
	}
	public void setValue(Value _val) throws RuntimeException
	{
		Array v = _val.castToArray();
		if (v != this)
		{
			values = new Reference[v.values.length];
			for (int i=0;i<v.values.length;i++)
			{
				values[i] = new Reference(v.values[i].getValue().clone());
			}
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
		for (Reference val : values)
		{
			ret.append(val.toString() + ",");
		}
		ret.append("]");
		return ret.toString();
	}
	@Override
	public boolean equalsToValue(Value _value)
	{
		if (!(_value instanceof Array))
		{
			return false;
		}
		Array other = (Array)_value;
		if (values.length != other.values.length)
		{
			return false;
		}
		for (int i=0;i<values.length;i++)
		{
			if (!values[i].getValue().equalsToValue(other.values[i].getValue()))
			{
				return false;
			}
		}
		return true;
	}
	@Override
	public Value clone()
	{
		Array array = new Array(values.length);
		for (int i=0;i<values.length;i++)
		{
			array.values[i] = new Reference(values[i].getValue().clone());
		}
		return array;
	}
}
