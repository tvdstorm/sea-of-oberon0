package oberon0.ast.expressions.logical;

import oberon0.ast.expressions.BaseBiliteralExpressionNode;
import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.BooleanValue;
import oberon0.environment.Context;
import oberon0.environment.IValue;

public class DisjunctionNode extends BaseBiliteralExpressionNode {

	public DisjunctionNode(IEvaluable lhsExpression,
			IEvaluable rhsExpression) {
		super(lhsExpression, rhsExpression);
	}

	@Override
	public IValue eval(Context context) {
		Boolean lhs = ((BooleanValue) evalLhsExpression(context)).getValue();
		Boolean rhs = ((BooleanValue) evalRhsExpression(context)).getValue();
		return new BooleanValue(lhs || rhs);
	}

}
