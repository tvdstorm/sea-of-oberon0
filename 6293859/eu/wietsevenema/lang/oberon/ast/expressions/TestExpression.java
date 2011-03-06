package eu.wietsevenema.lang.oberon.ast.expressions;

import xtc.tree.Node;

public class TestExpression extends Node {

	private Expression child;

	public Expression getChild() {
		return this.child;
	}

	public TestExpression(Expression exp) {
		this.child = exp;
	}

}
