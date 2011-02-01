package oberon0.ast;

import oberon0.environment.Context;

public class EqualsNode extends BaseBiliteralExpressionNode {

	public EqualsNode(IEvaluable lhsExpression, 
			IEvaluable rhsExpression) {
		super(lhsExpression, rhsExpression);
	}

	@Override
	public Object eval(Context context) {
		Object lhs = evalLhsExpression(context);
		Object rhs = evalRhsExpression(context);
		return lhs == rhs;
	}

}
