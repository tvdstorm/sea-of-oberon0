package ar.oberon0.ast.expression;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.Helper;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.ArithmeticValue;

public class NegationNode implements Interpretable {
	private Interpretable _nodeToNegate;

	public NegationNode(final Interpretable nodeToNegate) {
		_nodeToNegate = nodeToNegate;
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {

		return Helper.<ArithmeticValue> getValue(_nodeToNegate, context).negate();
	}

}
