package oberon0.ast;

import oberon0.environment.Context;

public class NegationNode extends BaseUniliteralExpressionNode {

	public NegationNode(IEvaluable lhsExpression) {
		super(lhsExpression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object eval(Context context) {
		return ! (Boolean) evalChildExpression(context);
	}

}
