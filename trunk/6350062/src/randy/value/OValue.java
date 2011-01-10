package randy.value;

import randy.exception.Oberon0Exception;
import randy.ast.Type;

public abstract class OValue
{
	public abstract OValue getValue();
	public abstract void setValue(OValue _val) throws Oberon0Exception;
	public abstract Type getType();
	public static OValue makeNew(Type type) throws Oberon0Exception
	{
		if (type.isInteger())
			return new OInteger(0);
		else if (type.isBool())
			return new OBoolean(false);
		else
			throw new Oberon0Exception("Can't build value of type '" + type + "'...");
	}
}
