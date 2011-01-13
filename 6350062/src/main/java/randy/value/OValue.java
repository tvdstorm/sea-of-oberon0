package randy.value;

import randy.exception.*;
import randy.ast.Type;

public abstract class OValue
{
	public abstract OValue dereference();
	public abstract void setValue(OValue _val) throws Oberon0RuntimeException;
	public abstract Type getType();
	public static OValue makeNew(Type type) throws Oberon0RuntimeException
	{
		if (type.isInteger())
			return new OInteger(0);
		else if (type.isBool())
			return new OBoolean(false);
		else
			throw new Oberon0UnknownTypeException(type.toString());
	}
}
