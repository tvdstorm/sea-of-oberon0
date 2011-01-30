package oberon.factory;

import oberon.ComparisonExpression;
import oberon.ComparisonType;
import oberon.Expression;
import oberon.node.AExgeExp;

public class ExgeExpInterpreter extends BaseInterpreter<Expression> {
	private Expression _right;
	private Expression _left;

	public void caseAExgeExp(AExgeExp node)
	{
		_left = ExpInterpreterFactory.getExpression(node.getLeft());
		_right = ExpInterpreterFactory.getExpression(node.getRight());
	}

	@Override
	public Expression BuildInterpreterResult() {
		return new ComparisonExpression(_left, _right, ComparisonType.Exge);
	}
}
