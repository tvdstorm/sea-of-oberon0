package oberon.factory;

import oberon.Expression;
import oberon.node.AParenExp;

public class ParenExpInterpreter extends BaseInterpreter<Expression> {
	private Expression _exp;

	public void caseAParenExp(AParenExp node)
	{
		_exp = ExpInterpreterFactory.getExpression(node.getExp());
	}

	@Override
	public Expression BuildInterpreterResult() {
		return _exp;
	}

}
