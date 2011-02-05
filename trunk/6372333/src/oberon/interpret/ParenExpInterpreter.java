package oberon.interpret;

import oberon.IExpression;
import oberon.node.AParenExp;

/**
 * The Class ParenExpInterpreter.
 */
public class ParenExpInterpreter extends AbstractBaseInterpreter<IExpression> {
	
	/** The paren exp. */
	private IExpression parenExp;

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAParenExp(oberon.node.AParenExp)
	 */
	@Override
	public void caseAParenExp(final AParenExp node){
		parenExp = ExpInterpreterFactory.getExpression(node.getExp());
	}

	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public IExpression buildInterpreterResult() {
		return parenExp;
	}

}
