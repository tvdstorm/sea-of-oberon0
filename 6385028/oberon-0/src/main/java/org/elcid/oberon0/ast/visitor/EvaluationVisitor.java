package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.ast.util.NodeType;
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
	public Object visitVariableExpNode(VariableExpNode node) {
		return node.getValue().accept(this);
	}

	@Override
	public Object visitEqualsExpNode(EqualsExpNode node) {
		return node.getLeftExp().accept(this) == node.getRightExp().accept(this);
	}

	@Override
	public Object visitGreaterExpNode(GreaterExpNode node) {
		assert node.getLeftExp().getNodeType() == NodeType.INTEGERNODE: "Left node is not an integer node";
		assert node.getRightExp().getNodeType() == NodeType.INTEGERNODE: "Right node is not an integer node";
		return (Integer) node.getLeftExp().accept(this) > (Integer) node.getRightExp().accept(this);
	}

	@Override
	public Object visitGreaterOrEqualsExpNode(GreaterOrEqualsExpNode node) {
		assert node.getLeftExp().getNodeType() == NodeType.INTEGERNODE: "Left node is not an integer node";
		assert node.getRightExp().getNodeType() == NodeType.INTEGERNODE: "Right node is not an integer node";
		return (Integer) node.getLeftExp().accept(this) >= (Integer) node.getRightExp().accept(this);
	}

	@Override
	public Object visitLesserExpNode(LesserExpNode node) {
		assert node.getLeftExp().getNodeType() == NodeType.INTEGERNODE: "Left node is not an integer node";
		assert node.getRightExp().getNodeType() == NodeType.INTEGERNODE: "Right node is not an integer node";
		return (Integer) node.getLeftExp().accept(this) < (Integer) node.getRightExp().accept(this);
	}

	@Override
	public Object visitLesserOrEqualsExpNode(LesserOrEqualsExpNode node) {
		assert node.getLeftExp().getNodeType() == NodeType.INTEGERNODE: "Left node is not an integer node";
		assert node.getRightExp().getNodeType() == NodeType.INTEGERNODE: "Right node is not an integer node";
		return (Integer) node.getLeftExp().accept(this) <= (Integer) node.getRightExp().accept(this);
	}
}
