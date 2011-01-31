package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;

/*
 * A simple type is a type that contains one value, for example an integer node.
 */
public class SimpleType implements CreatableType
{
	/*
	 * The name of the type.
	 */
	private String _typeName;

	/*
	 * Create a new simple type of the specified type.
	 */
	public SimpleType(String typeName)
	{
		_typeName = typeName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.DataTypes.CreatableType#createInstance(ar.oberon0
	 * .interpreter.Memory.Context)
	 */
	@Override
	public DataType createInstance(Context context) throws TechnicalException
	{
		if (_typeName.equals("INTEGER"))
			return new IntegerNode();
		throw new TechnicalException("Simple type " + _typeName + " is not supported");
	}

}
