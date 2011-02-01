package oberon0.ast.expressions;

import oberon0.environment.Context;

public class ModuloNode extends BaseBiliteralExpressionNode {

	public ModuloNode(IEvaluable lhsExpression, IEvaluable rhsExpression) {
		super(lhsExpression, rhsExpression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object eval(Context context) {
		int lhs = (Integer) evalLhsExpression(context);
		int rhs = (Integer) evalRhsExpression(context);
		return lhs % rhs;
	}

}
