package org.elcid.oberon0.ast;

import java.util.List;
import org.elcid.oberon0.ast.visitor.NodeVisitor;

/**
 * A representation of an integer in the Oberon-0 language
 *
 * @author Pieter Brandwijk
 */
public class IntegerNode extends Node {

	/** The integer's value can only be set once, when the object is constructed */
	private final int value;

	public IntegerNode(int value) {
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
	public Object accept(NodeVisitor iVisitor) {
		return iVisitor.visitIntegerNode(this);
	}

	@Override
	public NodeType getNodeType() {
		return NodeType.INTEGERNODE;
	}

}
