package randy.oberon0.value;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.*;

public abstract class Value
{
	public abstract Value dereference();
	public abstract void setValue(Value _val) throws RuntimeException;
	public abstract Type getType();
	public abstract Value clone();
	public Integer castToInteger() throws TypeMismatchException
	{
		Value dereferenced = dereference();
		if (dereferenced instanceof Integer)
			return (Integer)dereferenced;
		throw new TypeMismatchException(dereferenced.getType().toString(), Type.INTEGER.toString());
	}
	public Boolean castToBoolean() throws TypeMismatchException
	{
		Value dereferenced = dereference();
		if (dereferenced instanceof Boolean)
			return (Boolean)dereferenced;
		throw new TypeMismatchException(dereferenced.getType().toString(), Type.BOOLEAN.toString());
	}
	public Array castToArray() throws TypeMismatchException
	{
		Value dereferenced = dereference();
		if (dereferenced instanceof Array)
			return (Array)dereferenced;
		throw new TypeMismatchException(dereferenced.getType().toString(), Type.ARRAY.toString());
	}
	public Record castToRecord() throws TypeMismatchException
	{
		Value dereferenced = dereference();
		if (dereferenced instanceof Record)
			return (Record)dereferenced;
		throw new TypeMismatchException(dereferenced.getType().toString(), Type.RECORD.toString());
	}
	public abstract boolean equalsToValue(Value _value);
}
