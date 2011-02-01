package uva.oberon0.abstractsyntax.expressions;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.runtime.Scope;

public class Subtraction extends BaseExpressionBinary {

	public Subtraction(CommonTree parserTree) {
		super(parserTree);
	}

	@Override
	public int eval(Scope scope) {
		return getLeft().eval(scope) - getRight().eval(scope);
	}

}
