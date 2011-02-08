package oberon.convert;

import oberon.IExpression;
import oberon.expressions.IdentifierExpression;
import oberon.node.ASelectorExp;

/**
 * The Class SelectorExpConverter.
 */
public class SelectorExpConverter extends AbstractConverter<IExpression> {
	
	/** The value. */
	private IdentifierExpression value;
	
	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseASelectorExp(oberon.node.ASelectorExp)
	 */
	@Override
	public void caseASelectorExp(final ASelectorExp node) {
		final SelectorConverter interpreter = new SelectorConverter();
		node.getSelector().apply(interpreter);
		value = new IdentifierExpression(interpreter.buildInterpreterResult());
	}

	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public IExpression buildInterpreterResult() {
		return value;
	}

}
