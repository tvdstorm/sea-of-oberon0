package oberon0.ast;

import oberon0.environment.Context;

public class ConjunctionNode extends BaseBiliteralExpressionNode {

	public ConjunctionNode(IEvaluable lhsExpression, IEvaluable rhsExpression) {
		super(lhsExpression, rhsExpression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object eval(Context context) {
		// TODO Auto-generated method stub
		return null;
	}

}
