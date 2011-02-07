package oberon0.ast.expressions;

import oberon0.environment.Context;
import oberon0.environment.IValue;

public abstract class BaseBinaryExpressionNode implements IEvaluable{
	IEvaluable _lhsExpression;
	IEvaluable _rhsExpression;

	public BaseBinaryExpressionNode(IEvaluable lhsExpression, IEvaluable rhsExpression) {
		_lhsExpression = lhsExpression;
		_rhsExpression = rhsExpression;
		
	}
	
	public IValue evalLhsExpression(Context context){
		return _lhsExpression.eval(context);
	}
	
	public IValue evalRhsExpression(Context context){
		return _rhsExpression.eval(context);
	}
	
	public abstract IValue eval(Context context);

}
