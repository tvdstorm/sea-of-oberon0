package oberon.convert;

import oberon.IExpression;
import oberon.node.AParenExp;

/**
 * The Class ParenExpConverter.
 */
public class ParenExpConverter extends AbstractConverter<IExpression> {
	
	/** The paren exp. */
	private IExpression parenExp;

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAParenExp(oberon.node.AParenExp)
	 */
	@Override
	public void caseAParenExp(final AParenExp node){
		parenExp = ExpConverterFactory.getExpression(node.getExp());
	}

	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public IExpression buildInterpreterResult() {
		return parenExp;
	}

}
