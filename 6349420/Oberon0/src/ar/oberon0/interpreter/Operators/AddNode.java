package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.DataTypes.ArithmeticValue;
import ar.oberon0.interpreter.Memory.Context;

public class AddNode extends BinaryNode {
	public AddNode(final Interpretable leftNode, final Interpretable rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public final Object interpret(final Context context)
			throws TechnicalException {
		return this.<ArithmeticValue> getLeftValue(context).add(
				this.<ArithmeticValue> getRightValue(context));
	}
}
