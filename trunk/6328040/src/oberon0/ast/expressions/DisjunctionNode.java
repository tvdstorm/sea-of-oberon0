package oberon0.ast.expressions;

import oberon0.environment.Context;

public class DisjunctionNode extends BaseBiliteralExpressionNode {

	public DisjunctionNode(IEvaluable lhsExpression,
			IEvaluable rhsExpression) {
		super(lhsExpression, rhsExpression);
	}

	@Override
	public Object eval(Context context) {
		Boolean lhs = (Boolean) evalLhsExpression(context);
		Boolean rhs = (Boolean) evalRhsExpression(context);
		return lhs || rhs;
	}

}
