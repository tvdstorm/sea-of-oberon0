package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.DataTypes.ComparableValue;
import ar.oberon0.interpreter.Memory.Context;

public class SmallerOrEqualNode extends BinaryNode {
	public SmallerOrEqualNode(final Interpretable leftNode,
			final Interpretable rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public final Object interpret(final Context context)
			throws TechnicalException {
		int compareResult = this.<ComparableValue> getLeftValue(context)
				.compareTo(this.<ComparableValue> getRightValue(context));
		return compareResult <= 0;
	}

}
