package oberon.convert;

import oberon.IExpression;
import oberon.IIdentifier;
import oberon.data.ArrayIndexerIdentifier;
import oberon.data.RecordIndexerIdentifier;
import oberon.data.VariableIdentifier;
import oberon.node.AArrayexpressionSelector;
import oberon.node.AIdentifierSelector;
import oberon.node.ARecordSelector;

/**
 * The Class SelectorConverter.
 */
public class SelectorConverter extends AbstractConverter<IIdentifier> {
	
	/** The selector. */
	private IIdentifier selector;
	
	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAIdentifierSelector(oberon.node.AIdentifierSelector)
	 */
	@Override
	public void caseAIdentifierSelector(final AIdentifierSelector node) {
		selector = new VariableIdentifier(node.getIdentifier().toString().trim());
	}
	
	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseARecordSelector(oberon.node.ARecordSelector)
	 */
	@Override
	public void caseARecordSelector(final ARecordSelector node) {
		final SelectorConverter interpreter = new SelectorConverter();
		node.getSelector().apply(interpreter);
		final IIdentifier recordSelector = interpreter.buildInterpreterResult();
		
		selector = new RecordIndexerIdentifier(recordSelector, node.getIdentifier().toString().trim());
	}
	
	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAArrayexpressionSelector(oberon.node.AArrayexpressionSelector)
	 */
	@Override
	public void caseAArrayexpressionSelector(final AArrayexpressionSelector node) {
		final IExpression expression = ExpConverterFactory.getExpression(node.getExp());
		
		final SelectorConverter interpreter = new SelectorConverter();
		node.getSelector().apply(interpreter);
		final IIdentifier arraySelector = interpreter.buildInterpreterResult();
		
		selector = new ArrayIndexerIdentifier(arraySelector, expression);
	}
	
	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public IIdentifier buildInterpreterResult() {
		return selector;
	}

}
