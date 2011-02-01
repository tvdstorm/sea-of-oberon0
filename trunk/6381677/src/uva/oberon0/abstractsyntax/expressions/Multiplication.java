package uva.oberon0.abstractsyntax.expressions;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.runtime.Scope;

public class Multiplication extends BaseExpressionBinary {

	public Multiplication(CommonTree parserTree) {
		super(parserTree);
	}

	@Override
	public int eval(Scope scope) 
	{
		return getLeft().eval(scope) * getRight().eval(scope);
	}

}
