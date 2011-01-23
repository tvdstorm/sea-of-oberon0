package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.util.NodeType;
import java.util.List;
import org.elcid.oberon0.ast.visitor.NodeVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Represents binary, logical expressions in Oberon-0.
 *
 * @author Pieter Brandwijk
 */
public class BinaryExpNode extends ExpressionNode {

	private static final Logger LOG = LoggerFactory.getLogger(BinaryExpNode.class);

	private ExpressionNode leftExp;
	private ExpressionNode rightExp;
	private Node operator;

	public BinaryExpNode(ExpressionNode leftExp, ExpressionNode rightExp, Node operator) {
		this.leftExp = leftExp;
		this.rightExp = rightExp;
		this.operator = operator;
	}

	public Node getLeftExp() {
		return leftExp;
	}

	public Node getOperator() {
		return operator;
	}

	public Node getRightExp() {
		return rightExp;
	}

	@Override
	public Object accept(NodeVisitor visitor) {
		return visitor.visitBinaryExpNode(this);
	}

	@Override
	public List<Node> childNodes() {
		 return Node.createList(leftExp, operator, rightExp);
	}

	@Override
	public NodeType getNodeType() {
		return NodeType.BINARYEXPNODE;
	}
}
