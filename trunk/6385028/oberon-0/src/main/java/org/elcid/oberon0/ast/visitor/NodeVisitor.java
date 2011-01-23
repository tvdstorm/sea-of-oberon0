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
	public Object visitBinaryExpNode(BinaryExpNode node);
	public Object visitVariableExpNode(VariableExpNode node);

}
