package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;

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
