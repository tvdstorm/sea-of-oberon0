package oberon0.ast.expressions.logical;

import oberon0.ast.expressions.BaseBinaryExpressionNode;
import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.BooleanValue;

public class ConjunctionNode extends BaseBinaryExpressionNode {

	public ConjunctionNode(IEvaluable lhsExpression, IEvaluable rhsExpression) {
		super(lhsExpression, rhsExpression);
	}

	@Override
	public IValue eval(Context context) {
		Boolean lhs = ((BooleanValue) evalLhsExpression(context)).getValue();
		Boolean rhs = ((BooleanValue) evalRhsExpression(context)).getValue();
		return new BooleanValue(lhs && rhs);
	}

}
