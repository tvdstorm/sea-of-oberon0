package oberon0.ast.expressions;

import oberon0.environment.Context;
import oberon0.environment.IValue;

public abstract class BaseUniliteralExpressionNode implements IEvaluable{
	IEvaluable _lhsExpression;

	public BaseUniliteralExpressionNode(IEvaluable lhsExpression) {
		_lhsExpression = lhsExpression;
	}
	
	public IValue evalChildExpression(Context context){
		return _lhsExpression.eval(context);
	}
	
	public abstract IValue eval(Context context);

}
