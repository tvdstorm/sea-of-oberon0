package oberon.interpret;

import oberon.Expression;
import oberon.data.ArrayIndexerSelector;
import oberon.data.IdentifierSelector;
import oberon.data.Selector;
import oberon.node.AAdditionalselectorSelector;
import oberon.node.AArrayexpressionSelector;
import oberon.node.AIdentifierSelector;

public class SelectorInterpreter extends BaseInterpreter<Selector> {
	private Selector _selector;
	
	@Override
	public void caseAIdentifierSelector(AIdentifierSelector node)
	{
		_selector = new IdentifierSelector(node.getIdentifier().toString().trim());
	}
	
	@Override
	public void caseAAdditionalselectorSelector(AAdditionalselectorSelector node)
	{
		_selector = new IdentifierSelector(node.getIdentifier().toString().trim());
	}
	
	@Override
	public void caseAArrayexpressionSelector(AArrayexpressionSelector node)
	{
		Expression expression = ExpInterpreterFactory.getExpression(node.getExp());
		
		SelectorInterpreter interpreter = new SelectorInterpreter();
		node.getSelector().apply(interpreter);
		Selector selector = interpreter.BuildInterpreterResult();
		
		_selector = new ArrayIndexerSelector(selector, expression);
	}
	
	@Override
	public Selector BuildInterpreterResult() {
		return _selector;
	}

}
