package oberon.interpret;

import oberon.AbstractExpression;
import oberon.AbstractIntegerExpression;
import oberon.node.AIntegerExp;

public class ExpIntegerInterpreter extends AbstractBaseInterpreter<AbstractExpression> {
	private int value;

	public void caseAIntegerExp(final AIntegerExp node)
	{
		value = Integer.parseInt(node.getInteger().toString().trim());
	}

	@Override
	public AbstractExpression buildInterpreterResult() {
		return new AbstractIntegerExpression(value);
	}

}
