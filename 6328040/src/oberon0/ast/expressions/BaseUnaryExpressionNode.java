package oberon0.ast.expressions;

import oberon0.environment.Context;
import oberon0.environment.IValue;

public abstract class BaseUnaryExpressionNode implements IEvaluable {
	private final IEvaluable _lhsExpression;

	public BaseUnaryExpressionNode(IEvaluable lhsExpression) {
		_lhsExpression = lhsExpression;
	}

	public IValue evalChildExpression(Context context) {
		return _lhsExpression.eval(context);
	}

	public abstract IValue eval(Context context);

}
