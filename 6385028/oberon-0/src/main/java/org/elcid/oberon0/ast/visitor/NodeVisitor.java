package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.*;

/**
 *
 * @author Pieter Brandwijk
 */
public interface NodeVisitor {

	public Object visitIntegerNode(IntegerExpNode node);
	public Object visitIdentifierNode(IdentifierNode node);
	public Object visitArrayNode(ArrayNode node);
	public Object visitEqualsExpNode(EqualsExpNode node);
	public Object visitVariableExpNode(VariableExpNode node);
	public Object visitUnaryExpNode(UnaryExpNode node);

}
