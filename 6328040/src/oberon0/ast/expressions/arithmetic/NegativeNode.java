package oberon0.ast.expressions.arithmetic;

import oberon0.ast.expressions.BaseUnaryExpressionNode;
import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.IntegerValue;

public class NegativeNode extends BaseUnaryExpressionNode {

	public NegativeNode(IEvaluable lhsExpression) {
		super(lhsExpression);
	}

	@Override
	public IValue eval(Context context) {
		int positive = ((IntegerValue) evalChildExpression(context)).getValue();
		return new IntegerValue( 0 - positive);
	}

}
