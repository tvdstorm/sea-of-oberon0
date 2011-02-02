package oberon0.ast.expressions;

import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.IntegerValue;

public class AddNode extends BaseBiliteralExpressionNode {

	public AddNode(IEvaluable lhsExpression,
			IEvaluable rhsExpression) {
		super(lhsExpression, rhsExpression);
	}

	@Override
	public IValue eval(Context context) {
		int lhs = ((IntegerValue) evalLhsExpression(context)).getValue();
		int rhs = ((IntegerValue) evalRhsExpression(context)).getValue();
		return new IntegerValue(lhs + rhs);
	}
}
