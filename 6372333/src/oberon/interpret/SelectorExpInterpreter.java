package oberon.interpret;

import oberon.IExpression;
import oberon.expressions.IdentifierExpression;
import oberon.node.ASelectorExp;

public class SelectorExpInterpreter extends AbstractBaseInterpreter<IExpression> {
	private IdentifierExpression value;
	
	@Override
	public void caseASelectorExp(final ASelectorExp node) {
		final SelectorInterpreter interpreter = new SelectorInterpreter();
		node.getSelector().apply(interpreter);
		value = new IdentifierExpression(interpreter.buildInterpreterResult());
	}

	@Override
	public IExpression buildInterpreterResult() {
		return value;
	}

}
