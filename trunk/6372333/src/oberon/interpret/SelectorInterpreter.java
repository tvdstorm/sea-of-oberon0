package oberon.interpret;

import oberon.IExpression;
import oberon.data.ArrayIndexerSelector;
import oberon.data.IdentifierSelector;
import oberon.data.AbstractSelector;
import oberon.node.AAdditionalselectorSelector;
import oberon.node.AArrayexpressionSelector;
import oberon.node.AIdentifierSelector;

public class SelectorInterpreter extends AbstractBaseInterpreter<AbstractSelector> {
	private AbstractSelector selector;
	
	@Override
	public void caseAIdentifierSelector(final AIdentifierSelector node) {
		selector = new IdentifierSelector(node.getIdentifier().toString().trim());
	}
	
	@Override
	public void caseAAdditionalselectorSelector(final AAdditionalselectorSelector node) {
		selector = new IdentifierSelector(node.getIdentifier().toString().trim());
	}
	
	@Override
	public void caseAArrayexpressionSelector(final AArrayexpressionSelector node) {
		final IExpression expression = ExpInterpreterFactory.getExpression(node.getExp());
		
		final SelectorInterpreter interpreter = new SelectorInterpreter();
		node.getSelector().apply(interpreter);
		final AbstractSelector arraySelector = interpreter.buildInterpreterResult();
		
		selector = new ArrayIndexerSelector(arraySelector, expression);
	}
	
	@Override
	public AbstractSelector buildInterpreterResult() {
		return selector;
	}

}
