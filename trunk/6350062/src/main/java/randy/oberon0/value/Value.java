package randy.oberon0.value;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.*;

public abstract class Value
{
	public abstract Value dereference();
	public abstract void setValue(Value _val) throws RuntimeException;
	public abstract Type getType();
	public static Value makeNew(Type type) throws RuntimeException
	{
		if (type == Type.INTEGER)
			return new Integer(0);
		else if (type == Type.BOOLEAN)
			return new Boolean(false);
		else
			throw new UnknownTypeException(type.toString());
	}
	public Integer castToInteger() throws TypeMismatchException
	{
		if (this instanceof Integer)
			return (Integer)this;
		throw new TypeMismatchException(this.getType().toString(), Type.INTEGER.toString());
	}
	public Boolean castToBoolean() throws TypeMismatchException
	{
		if (this instanceof Boolean)
			return (Boolean)this;
		throw new TypeMismatchException(this.getType().toString(), Type.BOOLEAN.toString());
	}
	public Array castToArray() throws TypeMismatchException
	{
		if (this instanceof Array)
			return (Array)this;
		throw new TypeMismatchException(this.getType().toString(), Type.ARRAY.toString());
	}
	public Record castToRecord() throws TypeMismatchException
	{
		if (this instanceof Record)
			return (Record)this;
		throw new TypeMismatchException(this.getType().toString(), Type.RECORD.toString());
	}
	public abstract boolean equalsToValue(Value _value);
}