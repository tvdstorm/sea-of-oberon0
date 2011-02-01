package uva.oberon0.abstractsyntax.expressions;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.runtime.Scope;

public class NotEqual extends BaseExpressionBinary {

	public NotEqual(CommonTree parserTree) {
		super(parserTree);
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) != getRight().eval(scope) ? 1 : 0;
	}

}
