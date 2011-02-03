package oberon.interpret;

import oberon.AbstractExpression;
import oberon.node.AParenExp;

public class ParenExpInterpreter extends AbstractBaseInterpreter<AbstractExpression> {
	private AbstractExpression parenExp;

	public void caseAParenExp(final AParenExp node){
		parenExp = ExpInterpreterFactory.getExpression(node.getExp());
	}

	@Override
	public AbstractExpression buildInterpreterResult() {
		return parenExp;
	}

}
