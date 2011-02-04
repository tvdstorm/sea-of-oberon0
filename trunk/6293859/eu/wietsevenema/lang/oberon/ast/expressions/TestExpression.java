package eu.wietsevenema.lang.oberon.ast.expressions;

import xtc.tree.Node;
import eu.wietsevenema.lang.oberon.ast.visitors.TransformGenerics;


public class TestExpression extends Node {

	private Expression child;

	public Expression getChild() {
		return this.child;
	}

	public TestExpression(Node exp) {
		TransformGenerics tg = new TransformGenerics();
		this.child = (Expression) tg.dispatch(exp);
	}

	
}
