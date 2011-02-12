package oberon.convert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import oberon.IExpression;
import oberon.IIdentifier;
import oberon.data.*;
import oberon.node.*;

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
		Iterator<PRecord> iterator = node.getRecord().iterator();
		
		ARecord rootRecord = (ARecord) iterator.next();
		VariableIdentifier rootName = new VariableIdentifier(rootRecord.getIdentifier().toString().trim());
		
		List<String> subRecords = new ArrayList<String>();
		while (iterator.hasNext()){
			ARecord record = (ARecord)iterator.next();
			subRecords.add(record.getIdentifier().toString().trim());
		}
		
		selector = new RecordIndexerIdentifier(rootName, subRecords, 
				node.getIdentifier().toString().trim());
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
