package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;

public class OrNode extends BinaryNode {
	public OrNode(final Interpretable leftNode, final Interpretable rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		return (Boolean) this.getLeftExpression().interpret(context) || (Boolean) this.getRightExpression().interpret(context);
	}
}
