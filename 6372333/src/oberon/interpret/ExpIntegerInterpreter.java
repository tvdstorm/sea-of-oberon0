package oberon.interpret;

import oberon.IExpression;
import oberon.expressions.AbstractIntegerExpression;
import oberon.node.AIntegerExp;

public class ExpIntegerInterpreter extends AbstractBaseInterpreter<IExpression> {
	private int value;

	@Override
	public void caseAIntegerExp(final AIntegerExp node)
	{
		value = Integer.parseInt(node.getInteger().toString().trim());
	}

	@Override
	public IExpression buildInterpreterResult() {
		return new AbstractIntegerExpression(value);
	}

}
