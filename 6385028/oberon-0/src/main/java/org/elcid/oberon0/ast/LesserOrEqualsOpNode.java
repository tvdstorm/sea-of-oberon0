package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.util.NodeType;
import org.elcid.oberon0.ast.visitor.NodeVisitor;
import java.util.List;

/**
 * Represents the lesser-than-or-equals operator in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class LesserOrEqualsOpNode extends OperatorNode {

	public LesserOrEqualsOpNode() { }

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
		return NodeType.LESSEROREQUALSNODE;
	}

}
