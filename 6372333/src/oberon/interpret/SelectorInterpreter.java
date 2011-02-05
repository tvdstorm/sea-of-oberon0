package oberon.interpret;

import oberon.IExpression;
import oberon.IIdentifier;
import oberon.data.ArrayIndexerIdentifier;
import oberon.data.VariableIdentifier;
import oberon.node.AAdditionalselectorSelector;
import oberon.node.AArrayexpressionSelector;
import oberon.node.AIdentifierSelector;

public class SelectorInterpreter extends AbstractBaseInterpreter<IIdentifier> {
	private IIdentifier selector;
	
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
		final IIdentifier arraySelector = interpreter.buildInterpreterResult();
		
		selector = new ArrayIndexerIdentifier(arraySelector, expression);
	}
	
	@Override
	public IIdentifier buildInterpreterResult() {
		return selector;
	}

}
