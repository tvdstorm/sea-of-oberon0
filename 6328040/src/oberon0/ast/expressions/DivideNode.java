package oberon0.ast.expressions;

import oberon0.environment.Context;

public class DivideNode extends BaseBiliteralExpressionNode {

	public DivideNode(IEvaluable lhsExpression, IEvaluable rhsExpression) {
		super(lhsExpression, rhsExpression);
	}

	@Override
	public Object eval(Context context) {
		int lhs = (Integer) evalLhsExpression(context);
		int rhs = (Integer) evalRhsExpression(context);
		return lhs / rhs;
	}

}
