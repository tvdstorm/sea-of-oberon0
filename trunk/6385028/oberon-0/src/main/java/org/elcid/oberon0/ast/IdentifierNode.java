package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.util.NodeType;
import java.util.List;
import org.elcid.oberon0.ast.visitor.NodeVisitor;

/**
 * Representation of an identifier in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class IdentifierNode extends Node {

	/** The identifier's value can only be set once, when the object is constructed */
	private final String value;

	public IdentifierNode(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public List<Node> childNodes() {
		return EMPTY_LIST;
	}

	@Override
	public Object accept(NodeVisitor iVisitor) {
		return iVisitor.visitIdentifierNode(this);
	}

	@Override
	public NodeType getNodeType() {
		return NodeType.IDENTIFIERNODE;
	}
}
