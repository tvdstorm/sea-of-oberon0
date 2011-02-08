package ar.oberon0.ast.dataTypes;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.BooleanValue;
import ar.oberon0.values.IntegerValue;
import ar.oberon0.values.Value;

/*
 * A simple type can create a primitive type.
 */
public class SimpleType implements CreatableType {

	private String type;

	public SimpleType(String type) {
		assert type != null : "the type parameter can't be null.";
		if (!PrimitiveTypes.doesPrimitiveTypeExist(type)) {
			throw new TechnicalException("The type " + type + " does not exist.");
		}
		this.type = type;
	}

	@Override
	public Value createInstance(Context context) throws TechnicalException {
		if (this.type.equals(PrimitiveTypes.INTEGER)) {
			return new IntegerValue();
		}
		if (this.type.equals(PrimitiveTypes.BOOLEAN)) {
			return new BooleanValue();
		}
		throw new TechnicalException("Simple type " + this.type.toString() + " is not supported");
	}
}
