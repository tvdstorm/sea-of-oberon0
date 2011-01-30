package oberon.factory;

import oberon.Expression;
import oberon.IntegerExpression;
import oberon.node.AIntegerExp;

public class ExpIntegerInterpreter extends BaseInterpreter<Expression> {
	private int _value;

	public void caseAIntegerExp(AIntegerExp node)
	{
		_value = Integer.parseInt(node.getInteger().toString().trim());
	}

	@Override
	public Expression BuildInterpreterResult() {
		return new IntegerExpression(_value);
	}

}
