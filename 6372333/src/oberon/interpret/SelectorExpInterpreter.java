package oberon.interpret;

import oberon.IExpression;
import oberon.expressions.SelectorExpression;
import oberon.node.ASelectorExp;

public class SelectorExpInterpreter extends AbstractBaseInterpreter<IExpression> {
	private SelectorExpression value;
	
	@Override
	public void caseASelectorExp(final ASelectorExp node) {
		final SelectorInterpreter interpreter = new SelectorInterpreter();
		node.getSelector().apply(interpreter);
		value = new SelectorExpression(interpreter.buildInterpreterResult());
	}

	@Override
	public IExpression buildInterpreterResult() {
		return value;
	}

}
