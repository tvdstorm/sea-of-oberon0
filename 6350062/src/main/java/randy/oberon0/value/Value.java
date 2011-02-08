package randy.oberon0.value;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.*;

public abstract class Value
{
	public abstract void setValue(Value _val) throws RuntimeException;
	public abstract Type getType();
	public abstract Value clone();
	public Integer castToInteger() throws TypeMismatchException
	{
		if (this instanceof Integer)
		{
			return (Integer)this;
		}
		throw new TypeMismatchException(getType().toString(), Type.INTEGER.toString());
	}
	public Boolean castToBoolean() throws TypeMismatchException
	{
		if (this instanceof Boolean)
		{
			return (Boolean)this;
		}
		throw new TypeMismatchException(getType().toString(), Type.BOOLEAN.toString());
	}
	public Array castToArray() throws TypeMismatchException
	{
		if (this instanceof Array)
		{
			return (Array)this;
		}
		throw new TypeMismatchException(getType().toString(), Type.ARRAY.toString());
	}
	public Record castToRecord() throws TypeMismatchException
	{
		if (this instanceof Record)
		{
			return (Record)this;
		}
		throw new TypeMismatchException(getType().toString(), Type.RECORD.toString());
	}
	public abstract boolean equalsToValue(Value _value);
}
