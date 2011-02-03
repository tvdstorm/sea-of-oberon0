package ar.oberon0.ast.expression;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;

public class AndNode extends BinaryNode {

	public AndNode(final Interpretable leftNode, final Interpretable rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		return (Boolean) this.getLeftExpression().interpret(context) && (Boolean) this.getRightExpression().interpret(context);
	}

}
