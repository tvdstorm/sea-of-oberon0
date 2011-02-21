package ar.oberon0.ast.expression;

import java.util.ArrayList;
import java.util.List;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.CheckViolation;
import ar.oberon0.shared.Helper;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.ArithmeticValue;
import ar.oberon0.values.Negatable;
import ar.oberon0.values.Value;

public class NegationNode implements Interpretable {
	private Interpretable _nodeToNegate;

	public NegationNode(final Interpretable nodeToNegate) {
		assert nodeToNegate != null : "the nodeToNegate parameter can't be null.";
		_nodeToNegate = nodeToNegate;
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {

		return Helper.<ArithmeticValue> getValue(_nodeToNegate, context).negate();
	}

	@Override
	public List<CheckViolation> check(Context context) {
		List<CheckViolation> violations = new ArrayList<CheckViolation>();
		violations.addAll(_nodeToNegate.check(context));

		if (violations.size() > 0) {
			return violations;
		}

		Value value = (Value) _nodeToNegate.interpret(context);
		if (!(value instanceof Negatable)) {
			violations.add(new CheckViolation("The type " + value.getType() + " is not negatable.", value.getType().getClass()));
		}
		return violations;
	}
}
