package oberon.interpret;

import oberon.Expression;
import oberon.MathematicalExpression;
import oberon.MathematicalExpressionType;
import oberon.node.*;

public class MathematicalExpressionInterpreter extends BaseInterpreter<Expression>{
	private Expression _left;
	private Expression _right;
	private MathematicalExpressionType _type;
	
	@Override
	public void caseASubExp(ASubExp node)
	{
		_left = ExpInterpreterFactory.getExpression(node.getLeft());
		_right = ExpInterpreterFactory.getExpression(node.getRight());
		_type = MathematicalExpressionType.Sub;
	}

	@Override
	public void caseAAddExp(AAddExp node)
	{
		_left = ExpInterpreterFactory.getExpression(node.getLeft());
		_right = ExpInterpreterFactory.getExpression(node.getRight());
		_type = MathematicalExpressionType.Add;
	}

	@Override
	public void caseADivExp(ADivExp node)
	{
		_left = ExpInterpreterFactory.getExpression(node.getLeft());
		_right = ExpInterpreterFactory.getExpression(node.getRight());
		_type = MathematicalExpressionType.Div;
	}	

	@Override
	public void caseAModExp(AModExp node)
	{
		_left = ExpInterpreterFactory.getExpression(node.getLeft());
		_right = ExpInterpreterFactory.getExpression(node.getRight());
		_type = MathematicalExpressionType.Mod;
	}

	@Override
	public void caseAMulExp(AMulExp node)
	{
		_left = ExpInterpreterFactory.getExpression(node.getLeft());
		_right = ExpInterpreterFactory.getExpression(node.getRight());
		_type = MathematicalExpressionType.Mul;
	}
	
	@Override
	public Expression BuildInterpreterResult() {
		return new MathematicalExpression(_left, _right, _type);
	}

}
