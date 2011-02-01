package oberon.interpret;

import oberon.Expression;
import oberon.SelectorExpression;
import oberon.node.ASelectorExp;

public class SelectorExpInterpreter extends BaseInterpreter<Expression> {
	private SelectorExpression _value;
	
	@Override
	public void caseASelectorExp(ASelectorExp node)
	{
		SelectorInterpreter interpreter = new SelectorInterpreter();
		node.getSelector().apply(interpreter);
		_value = new SelectorExpression(interpreter.BuildInterpreterResult());
	}

	@Override
	public Expression BuildInterpreterResult() {
		return _value;
	}

}
