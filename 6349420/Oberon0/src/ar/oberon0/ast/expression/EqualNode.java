package ar.oberon0.ast.expression;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.BooleanValue;
import ar.oberon0.values.ComparableValue;

public class EqualNode extends BinaryNode {

	public EqualNode(final Interpretable leftNode, final Interpretable rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		int compareResult = this.<ComparableValue> getLeftValue(context).compareTo(this.<ComparableValue> getRightValue(context));
		return new BooleanValue(compareResult == 0);
	}

}