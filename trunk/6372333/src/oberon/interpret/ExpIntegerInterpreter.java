package oberon.interpret;

import oberon.AbstractIntegerExpression;
import oberon.IExpression;
import oberon.node.AIntegerExp;

public class ExpIntegerInterpreter extends AbstractBaseInterpreter<IExpression> {
	private int value;

	public void caseAIntegerExp(final AIntegerExp node)
	{
		value = Integer.parseInt(node.getInteger().toString().trim());
	}

	@Override
	public IExpression buildInterpreterResult() {
		return new AbstractIntegerExpression(value);
	}

}
