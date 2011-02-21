package ar.oberon0.ast.dataTypes;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.IntegerValue;
import ar.oberon0.values.Value;

public class IntegerType implements CreatableType, ArithmeticType {

	@Override
	public Value createInstance(Context context) throws TechnicalException {
		return new IntegerValue();
	}

	@Override
	public boolean equals(Object objectToCompare) {
		if (objectToCompare instanceof IntegerType) {
			return true;
		}
		return false;
	}

}
