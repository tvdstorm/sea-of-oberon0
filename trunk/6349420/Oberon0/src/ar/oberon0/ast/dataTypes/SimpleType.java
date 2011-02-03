package ar.oberon0.ast.dataTypes;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.IntegerNode;
import ar.oberon0.values.Value;

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
		if (!PrimitiveTypes.doesPrimitiveTypeExist(type)) {
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
		if (this.type.equals(PrimitiveTypes.INTEGER)) {
			return new IntegerNode();
		}
		throw new TechnicalException("Simple type " + this.type.toString() + " is not supported");
	}

}
