package oberon0.ast.expressions.relational;

import oberon0.ast.expressions.BaseBiliteralExpressionNode;
import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.BooleanValue;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.IntegerValue;

public class SmallerThenNode extends BaseBiliteralExpressionNode {

	public SmallerThenNode(IEvaluable lhsExpression,
			IEvaluable rhsExpression) {
		super(lhsExpression, rhsExpression);
	}

	@Override
	public IValue eval(Context context) {
		int lhs = ((IntegerValue) evalLhsExpression(context)).getValue();
		int rhs = ((IntegerValue) evalRhsExpression(context)).getValue();
		return new BooleanValue(lhs < rhs);
	}

}
