package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;

/*
 * A simple type is a type that contains one value, for example an integer node.
 */
public class SimpleType implements CreatableType {
	/*
	 * The name of the type.
	 */
	private String type;

	/*
	 * Create a new simple type of the specified type.
	 */
	public SimpleType(String type) {
		if (!PrimitiveType.doesPrimitiveTypeExist(type)) {
			throw new TechnicalException("The type " + type + " does not exist.");
		}
		this.type = type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.DataTypes.CreatableType#createInstance(ar.oberon0
	 * .interpreter.Memory.Context)
	 */
	@Override
	public Value createInstance(Context context) throws TechnicalException {
		if (this.type.equals(PrimitiveType.INTEGER)) {
			return new IntegerNode();
		}
		throw new TechnicalException("Simple type " + this.type.toString() + " is not supported");
	}

}
