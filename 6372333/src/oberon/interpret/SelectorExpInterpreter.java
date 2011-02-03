package oberon.interpret;

import oberon.AbstractExpression;
import oberon.SelectorExpression;
import oberon.node.ASelectorExp;

public class SelectorExpInterpreter extends AbstractBaseInterpreter<AbstractExpression> {
	private SelectorExpression value;
	
	@Override
	public void caseASelectorExp(final ASelectorExp node) {
		final SelectorInterpreter interpreter = new SelectorInterpreter();
		node.getSelector().apply(interpreter);
		value = new SelectorExpression(interpreter.buildInterpreterResult());
	}

	@Override
	public AbstractExpression buildInterpreterResult() {
		return value;
	}

}
