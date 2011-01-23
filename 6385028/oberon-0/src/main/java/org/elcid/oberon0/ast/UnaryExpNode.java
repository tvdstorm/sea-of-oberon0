package org.elcid.oberon0.ast;

import java.util.List;
import org.elcid.oberon0.ast.util.NodeType;
import org.elcid.oberon0.ast.visitor.NodeVisitor;

/**
 * Represents a unary expression in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class UnaryExpNode extends ExpressionNode {

	private OperatorNode operator;
	private ExpressionNode operand;

	public ExpressionNode getOperand() {
		return operand;
	}

	public OperatorNode getOperator() {
		return operator;
	}

	@Override
	public Object accept(NodeVisitor visitor) {
		return visitor.visitUnaryExpNode(this);
	}

	@Override
	public List<Node> childNodes() {
		return createList(operator, operand);
	}

	@Override
	public NodeType getNodeType() {
		return NodeType.UNARYEXPNODE;
	}
}
