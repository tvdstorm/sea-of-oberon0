package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;

public class LookupType implements CreatableType {
	String name;

	public LookupType(String name) {
		this.name = name;
	}

	@Override
	public Value createInstance(Context context) throws TechnicalException {
		if (PrimitiveType.doesPrimitiveTypeExist(name)) {
			return new SimpleType(name).createInstance(context);
		}

		CreatableType type = context.getType(this.name);
		return type.createInstance(context);
	}

}
