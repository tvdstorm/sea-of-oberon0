package ar.oberon0.ast.dataTypes;

import junit.framework.Assert;
import ar.oberon0.runtime.Context;
import ar.oberon0.shared.Helper;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.ArrayValue;
import ar.oberon0.values.IntegerValue;
import ar.oberon0.values.Value;

public class ArrayType implements CreatableType {
	private Interpretable length;
	private CreatableType type;

	public ArrayType(Interpretable length, CreatableType type) {
		Assert.assertNotNull("the length parameter can't be null.", length);
		Assert.assertNotNull("the type parameter can't be null.", type);
		this.length = length;
		this.type = type;
	}

	@Override
	public Value createInstance(Context context) throws TechnicalException {
		IntegerValue length = (IntegerValue) Helper.getValue((Interpretable) this.length.interpret(context), context);
		return new ArrayValue(length, this.type);
	}

}
