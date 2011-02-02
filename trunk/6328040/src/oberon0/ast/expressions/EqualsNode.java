package oberon0.ast.expressions;

import oberon0.environment.BooleanValue;
import oberon0.environment.Context;
import oberon0.environment.IValue;

public class EqualsNode extends BaseBiliteralExpressionNode {

	public EqualsNode(IEvaluable lhsExpression, 
			IEvaluable rhsExpression) {
		super(lhsExpression, rhsExpression);
	}

	@Override
	public IValue eval(Context context) {
		return new BooleanValue(evalLhsExpression(context) == evalRhsExpression(context));
	}

}
