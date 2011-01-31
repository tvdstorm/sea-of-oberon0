package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;

/*
 * Classes that implement this interface are able to create a DataType.
 * Classes that implement this interface are used to create the oberon 0 DataTypes, for example a integer.
 */
public interface CreatableType
{
	/*
	 * Create the specified DataType object.
	 */
	public Value createInstance(Context context) throws TechnicalException;
}
