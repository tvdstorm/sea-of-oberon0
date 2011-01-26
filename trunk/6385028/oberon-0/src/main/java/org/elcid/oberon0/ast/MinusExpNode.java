package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.util.NodeType;
import org.elcid.oberon0.ast.visitor.NodeVisitor;
import java.util.List;

/**
 * Represents the minus ('-') expression in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class MinusExpNode extends ExpressionNode {

	private ExpressionNode leftExp;
	private ExpressionNode rightExp;

	public MinusExpNode(ExpressionNode leftExp, ExpressionNode rightExp) {
		this.leftExp = leftExp;
		this.rightExp = rightExp;
	}

	public Node getLeftExp() {
		return leftExp;
	}

	public Node getRightExp() {
		return rightExp;
	}

	@Override
	public Object accept(NodeVisitor visitor) {
		return visitor.visitMinusExpNode(this);
	}

	@Override
	public List<Node> childNodes() {
		return createList(leftExp, rightExp);
	}

	@Override
	public NodeType getNodeType() {
		return NodeType.MINUSNODE;
	}

}
