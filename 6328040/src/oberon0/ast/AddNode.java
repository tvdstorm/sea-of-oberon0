package oberon0.ast;

import oberon0.environment.Context;

public class AddNode extends BaseBiliteralExpressionNode {

	public AddNode(IEvaluable lhsExpression,
			IEvaluable rhsExpression) {
		super(lhsExpression, rhsExpression);
	}

	@Override
	public Object eval(Context context) {
		int lhs = (Integer) evalLhsExpression(context);
		int rhs = (Integer) evalRhsExpression(context);
		return lhs + rhs;
	}
}
