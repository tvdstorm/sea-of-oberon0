package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.DataTypes.ArithmeticValue;
import ar.oberon0.interpreter.Memory.Context;

public class MinNode extends BinaryNode {
	public MinNode(final Interpretable leftNode, final Interpretable rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public final Object interpret(final Context context)
			throws TechnicalException {
		return this.<ArithmeticValue> getLeftValue(context).subtract(
				this.<ArithmeticValue> getRightValue(context));
	}

}
