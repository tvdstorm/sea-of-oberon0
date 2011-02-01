package oberon0.ast.expressions;

import oberon0.environment.Context;

public class EqualsNotNode extends BaseBiliteralExpressionNode {

	public EqualsNotNode(IEvaluable lhsExpression,
			IEvaluable rhsExpression) {
		super(lhsExpression, rhsExpression);
	}

	@Override
	public Object eval(Context context) {
		Object lhs = evalLhsExpression(context);
		Object rhs = evalRhsExpression(context);
		return lhs != rhs;
	}

}