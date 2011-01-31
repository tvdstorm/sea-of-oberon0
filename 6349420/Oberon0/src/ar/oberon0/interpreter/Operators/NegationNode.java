package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.DataTypes.ArithmeticValue;
import ar.oberon0.interpreter.Memory.Context;

public class NegationNode implements Interpretable {
	private Interpretable _nodeToNegate;

	public NegationNode(final Interpretable nodeToNegate) {
		_nodeToNegate = nodeToNegate;
	}

	@Override
	public final Object interpret(final Context context)
			throws TechnicalException {

		return Helper.<ArithmeticValue> getValue(_nodeToNegate, context)
				.negate();
	}

}
