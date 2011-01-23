package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.util.NodeType;
import java.util.List;
import org.elcid.oberon0.ast.visitor.NodeVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class EqualsNode extends Node {

	public EqualsNode() {
		
	}

	@Override
	public Object accept(NodeVisitor visitor) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public List<Node> childNodes() {
		return EMPTY_LIST;
	}

	@Override
	public NodeType getNodeType() {
		return NodeType.EQUALSNODE;
	}

}
