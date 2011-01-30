package oberon.factory;

import oberon.Expression;
import oberon.MathematicalExpression;
import oberon.MathematicalExpressionType;
import oberon.node.AAddExp;

public class AddExpInterpreter extends BaseInterpreter<Expression> {

	private Expression _right;
	private Expression _left;

	public void caseAAddExp(AAddExp node)
	{
		_left = ExpInterpreterFactory.getExpression(node.getLeft());
		_right = ExpInterpreterFactory.getExpression(node.getRight());
	}

	@Override
	public Expression BuildInterpreterResult() {
		return new MathematicalExpression(_left, _right, MathematicalExpressionType.Add);
	}
}
