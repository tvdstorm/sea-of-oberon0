package oberon0.ast;

import oberon0.environment.Context;

public abstract class BaseBiliteralExpressionNode implements IEvaluable{
	IEvaluable _lhsExpression;
	IEvaluable _rhsExpression;

	public BaseBiliteralExpressionNode(IEvaluable lhsExpression, IEvaluable rhsExpression) {
		_lhsExpression = lhsExpression;
		_rhsExpression = rhsExpression;
	}
	
	public Object evalLhsExpression(Context context){
		return _lhsExpression.eval(context);
	}
	
	public Object evalRhsExpression(Context context){
		return _rhsExpression.eval(context);
	}
	
	public abstract Object eval(Context context);

}
