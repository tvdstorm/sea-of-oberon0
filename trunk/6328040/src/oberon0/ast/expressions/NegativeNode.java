package oberon0.ast.expressions;

import oberon0.environment.Context;

public class NegativeNode extends BaseUniliteralExpressionNode {

	public NegativeNode(IEvaluable lhsExpression) {
		super(lhsExpression);
	}

	@Override
	public Object eval(Context context) {
		return - (Integer) evalChildExpression(context);
	}

}
