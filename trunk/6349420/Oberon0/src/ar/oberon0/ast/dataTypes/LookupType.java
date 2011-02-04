package ar.oberon0.ast.dataTypes;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.Value;

public class LookupType implements CreatableType {
	String name;

	public LookupType(String name) {
		this.name = name;
	}

	@Override
	public Value createInstance(Context context) throws TechnicalException {
		if (PrimitiveTypes.doesPrimitiveTypeExist(name)) {
			return new SimpleType(name).createInstance(context);
		}

		CreatableType type = context.getType(this.name);
		return type.createInstance(context);
	}

}