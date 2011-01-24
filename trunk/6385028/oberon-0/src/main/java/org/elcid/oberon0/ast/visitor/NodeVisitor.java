package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.*;

/**
 * Interface for visitor classes that visit the AST of Oberon-0.
 *
 * @author Pieter Brandwijk
 */
public interface NodeVisitor {

	public Object visitIntegerNode(IntegerExpNode node);
	public Object visitIdentifierNode(IdentifierNode node);
	public Object visitArrayNode(ArrayNode node);
	public Object visitEqualsExpNode(EqualsExpNode node);
	public Object visitVariableExpNode(VariableExpNode node);
	public Object visitGreaterExpNode(GreaterExpNode node);
	public Object visitGreaterOrEqualsExpNode(GreaterOrEqualsExpNode node);
	public Object visitLesserExpNode(LesserExpNode node);
	public Object visitLesserOrEqualsExpNode(LesserOrEqualsExpNode node);

}
