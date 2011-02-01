package oberon0.ast;

import oberon0.environment.Context;

public class DivideNode extends BaseBiliteralExpressionNode {

	public DivideNode(IEvaluable lhsExpression, IEvaluable rhsExpression) {
		super(lhsExpression, rhsExpression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object eval(Context context) {
		int lhs = (Integer) evalLhsExpression(context);
		int rhs = (Integer) evalRhsExpression(context);
		return lhs / rhs;
	}

}
