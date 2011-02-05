package oberon.interpret;

import oberon.IExpression;
import oberon.data.ArrayIndexerIdentifier;
import oberon.data.VariableIdentifier;
import oberon.data.AbstractIdentifier;
import oberon.node.AAdditionalselectorSelector;
import oberon.node.AArrayexpressionSelector;
import oberon.node.AIdentifierSelector;

public class SelectorInterpreter extends AbstractBaseInterpreter<AbstractIdentifier> {
	private AbstractIdentifier selector;
	
	@Override
	public void caseAIdentifierSelector(final AIdentifierSelector node) {
		selector = new VariableIdentifier(node.getIdentifier().toString().trim());
	}
	
	@Override
	public void caseAAdditionalselectorSelector(final AAdditionalselectorSelector node) {
		selector = new VariableIdentifier(node.getIdentifier().toString().trim());
	}
	
	@Override
	public void caseAArrayexpressionSelector(final AArrayexpressionSelector node) {
		final IExpression expression = ExpInterpreterFactory.getExpression(node.getExp());
		
		final SelectorInterpreter interpreter = new SelectorInterpreter();
		node.getSelector().apply(interpreter);
		final AbstractIdentifier arraySelector = interpreter.buildInterpreterResult();
		
		selector = new ArrayIndexerIdentifier(arraySelector, expression);
	}
	
	@Override
	public AbstractIdentifier buildInterpreterResult() {
		return selector;
	}

}
