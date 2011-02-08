package oberon.convert;

import oberon.IExpression;
import oberon.expressions.IntegerExpression;
import oberon.node.AIntegerExp;

/**
 * The Class ExpIntegerConverter.
 */
public class ExpIntegerConverter extends AbstractConverter<IExpression> {
	
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
		return new IntegerExpression(value);
	}

}
