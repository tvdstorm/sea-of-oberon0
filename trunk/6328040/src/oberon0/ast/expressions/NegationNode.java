package oberon0.ast.expressions;

import oberon0.environment.Context;

public class NegationNode extends BaseUniliteralExpressionNode {

	public NegationNode(IEvaluable lhsExpression) {
		super(lhsExpression);
	}

	@Override
	public Object eval(Context context) {
		return ! (Boolean) evalChildExpression(context);
	}

}
