package oberon.interpret;

import oberon.IExpression;
import oberon.node.AParenExp;

public class ParenExpInterpreter extends AbstractBaseInterpreter<IExpression> {
	private IExpression parenExp;

	public void caseAParenExp(final AParenExp node){
		parenExp = ExpInterpreterFactory.getExpression(node.getExp());
	}

	@Override
	public IExpression buildInterpreterResult() {
		return parenExp;
	}

}
