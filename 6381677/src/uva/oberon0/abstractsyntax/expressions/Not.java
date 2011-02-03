package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;

public class Not extends BaseExpressionUnary {

	public Not(BaseNode argument) {
		super(argument);
	}

	@Override
	public int eval(Scope scope) {
		return getArgument().eval(scope) == 0 ? 1 : 0;
	}

}
