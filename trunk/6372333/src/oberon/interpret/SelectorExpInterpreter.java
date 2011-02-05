package oberon.interpret;

import oberon.IExpression;
import oberon.expressions.IdentifierExpression;
import oberon.node.ASelectorExp;

/**
 * The Class SelectorExpInterpreter.
 */
public class SelectorExpInterpreter extends AbstractBaseInterpreter<IExpression> {
	
	/** The value. */
	private IdentifierExpression value;
	
	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseASelectorExp(oberon.node.ASelectorExp)
	 */
	@Override
	public void caseASelectorExp(final ASelectorExp node) {
		final SelectorInterpreter interpreter = new SelectorInterpreter();
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
