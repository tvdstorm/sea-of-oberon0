package oberon.interpret;

import oberon.IExpression;
import oberon.expressions.AbstractIntegerExpression;
import oberon.node.AIntegerExp;

/**
 * The Class ExpIntegerInterpreter.
 */
public class ExpIntegerInterpreter extends AbstractBaseInterpreter<IExpression> {
	
	/** The value. */
	private int value;

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAIntegerExp(oberon.node.AIntegerExp)
	 */
	@Override
	public void caseAIntegerExp(final AIntegerExp node)
	{
		value = Integer.parseInt(node.getInteger().toString().trim());
	}

	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public IExpression buildInterpreterResult() {
		return new AbstractIntegerExpression(value);
	}

}
