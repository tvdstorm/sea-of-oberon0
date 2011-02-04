package eu.wietsevenema.lang.oberon.ast.statements;

import xtc.tree.Node;
import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.visitors.TransformGenerics;

public abstract class Statement extends Node {

	protected Expression transformExpression(Node n){
		TransformGenerics tg = new TransformGenerics();
		return (Expression)tg.dispatch(n);
	}
	
}
