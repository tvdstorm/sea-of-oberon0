package ar.oberon0.ast.dataTypes;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.Helper;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.Array;
import ar.oberon0.values.IntegerNode;
import ar.oberon0.values.Value;

public class ArrayType implements CreatableType {
	private Interpretable length;
	private CreatableType type;

	public ArrayType(Interpretable length, CreatableType type) {
		this.length = length;
		this.type = type;
	}

	@Override
	public Value createInstance(Context context) throws TechnicalException {
		IntegerNode length = (IntegerNode) Helper.getValue((Interpretable) this.length.interpret(context), context);
		return new Array(length, this.type);
	}

}
