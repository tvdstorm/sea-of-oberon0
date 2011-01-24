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
		else if (type == Type.BOOL)
			return new OBoolean(false);
		else
			throw new Oberon0UnknownTypeException(type.toString());
	}
}
