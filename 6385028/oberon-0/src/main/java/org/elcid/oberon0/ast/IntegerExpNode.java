package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.util.NodeType;
import java.util.List;
import org.elcid.oberon0.ast.visitor.NodeVisitor;

/**
 * A representation of an integer in the Oberon-0 language
 *
 * @author Pieter Brandwijk
 */
public class IntegerExpNode extends ExpressionNode {

	/** The integer's value can only be set once, when the object is constructed */
	private final int value;

	public IntegerExpNode(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public List<Node> childNodes() {
		return EMPTY_LIST;
	}

	@Override
	public Object accept(NodeVisitor visitor) {
		return visitor.visitIntegerNode(this);
	}

	@Override
	public NodeType getNodeType() {
		return NodeType.INTEGERNODE;
	}

}
