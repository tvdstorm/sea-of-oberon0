package org.elcid.oberon0.ast;

import java.util.List;
import org.elcid.oberon0.ast.visitor.NodeVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Pieter Brandwijk
 */
public class BinaryExpNode extends Node {

	private static final Logger LOG = LoggerFactory.getLogger(BinaryExpNode.class);

	private Node leftExp;
	private Node rightExp;
	private Node operator;

	public BinaryExpNode(Node leftExp, Node rightExp, Node operator) {
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
