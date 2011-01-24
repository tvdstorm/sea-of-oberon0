package randy.value;

import randy.exception.*;

public abstract class OValue
{
	public abstract OValue dereference();
	public abstract void setValue(OValue _val) throws Oberon0RuntimeException;
	public abstract Type getType();
	public static OValue makeNew(Type type) throws Oberon0RuntimeException
	{
		if (type == Type.INTEGER)
			return new OInteger(0);
		else if (type == Type.BOOLEAN)
			return new OBoolean(false);
		else
			throw new Oberon0UnknownTypeException(type.toString());
	}
	public OInteger castToInteger() throws Oberon0TypeMismatchException
	{
		if (this instanceof OInteger)
			return (OInteger)this;
		throw new Oberon0TypeMismatchException(this.getType(), Type.INTEGER);
	}
	public OBoolean castToBoolean() throws Oberon0TypeMismatchException
	{
		if (this instanceof OBoolean)
			return (OBoolean)this;
		throw new Oberon0TypeMismatchException(this.getType(), Type.BOOLEAN);
	}
	public OArray castToArray() throws Oberon0TypeMismatchException
	{
		if (this instanceof OArray)
			return (OArray)this;
		throw new Oberon0TypeMismatchException(this.getType(), Type.ARRAY);
	}
}
