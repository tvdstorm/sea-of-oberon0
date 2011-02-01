package oberon0.ast.expressions;

import oberon0.environment.Context;

public class GreaterEqualNode extends BaseBiliteralExpressionNode {

	public GreaterEqualNode(IEvaluable lhsExpression,
			IEvaluable rhsExpression) {
		super(lhsExpression, rhsExpression);
	}

	@Override
	public Object eval(Context context) {
		int lhs = (Integer) evalLhsExpression(context);
		int rhs = (Integer) evalRhsExpression(context);
		return lhs >= rhs;
	}

}
