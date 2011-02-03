package ar.oberon0.ast.expression;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.ArithmeticValue;
import ar.oberon0.values.Value;

public class AddNode extends BinaryNode {
	public AddNode(final Interpretable leftNode, final Interpretable rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public final Value interpret(final Context context) throws TechnicalException {
		return this.<ArithmeticValue> getLeftValue(context).add(this.<ArithmeticValue> getRightValue(context));
	}
}
