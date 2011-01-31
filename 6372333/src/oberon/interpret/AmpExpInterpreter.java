package oberon.interpret;

import oberon.ComparisonExpression;
import oberon.Expression;
import oberon.node.AAmpExp;

public class AmpExpInterpreter extends BaseInterpreter<Expression> {
	private Expression _right;
	private Expression _left;

	public void caseAAmpExp(AAmpExp node)
	{
		_left = ExpInterpreterFactory.getExpression(node.getLeft());
		_right = ExpInterpreterFactory.getExpression(node.getRight());
	}

	@Override
	public Expression BuildInterpreterResult() {
		return new ComparisonExpression(_left, _right, oberon.ComparisonType.Amp);
	}

}
