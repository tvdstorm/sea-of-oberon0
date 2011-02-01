package oberon0.ast;

import oberon0.environment.Context;

public abstract class BaseUniliteralExpressionNode implements IEvaluable{
	IEvaluable _lhsExpression;

	public BaseUniliteralExpressionNode(IEvaluable lhsExpression) {
		_lhsExpression = lhsExpression;
	}
	
	public Object evalChildExpression(Context context){
		return _lhsExpression.eval(context);
	}
	
	public abstract Object eval(Context context);

}
