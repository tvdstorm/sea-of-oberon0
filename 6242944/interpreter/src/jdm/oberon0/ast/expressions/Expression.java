package jdm.oberon0.ast.expressions;

import jdm.oberon0.ast.Node;

public abstract class Expression extends Node {
	
	public abstract <T> T accept(ExpressionVisitor<T> visitor);
}
