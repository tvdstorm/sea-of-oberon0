package ar.oberon0.ast.dataTypes;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.BooleanValue;
import ar.oberon0.values.Value;

public class BooleanType implements CreatableType {

	@Override
	public Value createInstance(final Context context) throws TechnicalException {
		return new BooleanValue();
	}

	@Override
	public boolean equals(Object objectToCompare) {
		if (objectToCompare instanceof BooleanType) {
			return true;
		}
		return false;
	}

}
