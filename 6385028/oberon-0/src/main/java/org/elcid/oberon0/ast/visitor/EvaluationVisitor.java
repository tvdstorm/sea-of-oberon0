package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.ArrayNode;
import org.elcid.oberon0.ast.EqualsExpNode;
import org.elcid.oberon0.ast.IdentifierNode;
import org.elcid.oberon0.ast.IntegerExpNode;
import org.elcid.oberon0.ast.UnaryExpNode;
import org.elcid.oberon0.ast.VariableExpNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Contains the evaluation algoritms for the nodes in the AST.
 *
 * @author Pieter Brandwijk
 */
public class EvaluationVisitor implements NodeVisitor {

	private static final Logger LOG = LoggerFactory.getLogger(EvaluationVisitor.class);

	@Override
	public Object visitIntegerNode(IntegerExpNode node) {
		return node.getValue();
	}

	@Override
	public Object visitIdentifierNode(IdentifierNode node) {
		return node.getValue();
	}

	@Override
	public Object visitArrayNode(ArrayNode node) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Object visitEqualsExpNode(EqualsExpNode node) {
		return node.getLeftExp().accept(this) == node.getRightExp().accept(this);
	}

	@Override
	public Object visitVariableExpNode(VariableExpNode node) {
		return node.getValue().accept(this);
	}

	@Override
	public Object visitUnaryExpNode(UnaryExpNode node) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
