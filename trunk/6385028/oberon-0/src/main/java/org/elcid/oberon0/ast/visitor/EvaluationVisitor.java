package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.ArrayNode;
import org.elcid.oberon0.ast.BinaryExpNode;
import org.elcid.oberon0.ast.IdentifierNode;
import org.elcid.oberon0.ast.IntegerExpNode;
import org.elcid.oberon0.ast.NodeType;
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
	public Object visitBinaryExpNode(BinaryExpNode node) {
		NodeType operatorType = node.getOperator().getNodeType();
		switch (operatorType) {
			case EQUALSNODE:
				return node.getLeftExp().accept(this) == node.getRightExp().accept(this);
			default:
				LOG.warn("Unexpected node : " + operatorType + ", returning false");
				return false;
		}

	}
}
