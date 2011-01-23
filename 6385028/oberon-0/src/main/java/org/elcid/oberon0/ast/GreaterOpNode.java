package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.util.NodeType;
import org.elcid.oberon0.ast.visitor.NodeVisitor;
import java.util.List;

/**
 * Represents the greater-than operator in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class GreaterOpNode extends OperatorNode {

	public GreaterOpNode() { }

	@Override
	public Object accept(NodeVisitor visitor) {
		throw new UnsupportedOperationException("Not supported for this class.");
	}

	@Override
	public List<Node> childNodes() {
		return EMPTY_LIST;
	}

	@Override
	public NodeType getNodeType() {
		return NodeType.GREATERNODE;
	}

}
