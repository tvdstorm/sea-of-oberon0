package ar.oberon0.ast.expression;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.BooleanValue;

public class AndNode extends BinaryNode {

	public AndNode(final Interpretable leftNode, final Interpretable rightNode) {
		super(leftNode, rightNode);
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		Boolean rawResult = ((BooleanValue) this.getLeftExpression().interpret(context)).getValueAsBoolean() && ((BooleanValue) this.getRightExpression().interpret(context)).getValueAsBoolean();
		return new BooleanValue(rawResult);
	}

}
