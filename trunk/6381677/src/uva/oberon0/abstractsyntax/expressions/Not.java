package uva.oberon0.abstractsyntax.expressions;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.runtime.Scope;

public class Not extends BaseExpressionUnary {

	public Not(CommonTree parserTree) {
		super(parserTree);
	}

	@Override
	public int eval(Scope scope) {
		return getArgument().eval(scope) == 0 ? 1 : 0;
	}

}
