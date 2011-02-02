package oberon0.ast.expressions;

import oberon0.environment.BooleanValue;
import oberon0.environment.Context;
import oberon0.environment.IValue;

public class NegationNode extends BaseUniliteralExpressionNode {

	public NegationNode(IEvaluable lhsExpression) {
		super(lhsExpression);
	}

	@Override
	public IValue eval(Context context) {
		boolean bool = ((BooleanValue) evalChildExpression(context)).getValue();
		return new BooleanValue(! bool);
	}

}
