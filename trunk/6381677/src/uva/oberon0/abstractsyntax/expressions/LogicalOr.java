package uva.oberon0.abstractsyntax.expressions;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.runtime.Scope;

public class LogicalOr extends BaseExpressionBinary {

	public LogicalOr(CommonTree parserTree) {
		super(parserTree);
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) == 1 || getRight().eval(scope) == 1 ? 1 : 0;
	}

}
