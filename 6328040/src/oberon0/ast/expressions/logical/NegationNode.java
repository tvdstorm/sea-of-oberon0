package oberon0.ast.expressions.logical;

import oberon0.ast.expressions.BaseUnaryExpressionNode;
import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.BooleanValue;
import oberon0.environment.Context;
import oberon0.environment.IValue;

public class NegationNode extends BaseUnaryExpressionNode {

	public NegationNode(IEvaluable lhsExpression) {
		super(lhsExpression);
	}

	@Override
	public IValue eval(Context context) {
		boolean bool = ((BooleanValue) evalChildExpression(context)).getValue();
		return new BooleanValue(!bool);
	}

}
