package org.elcid.oberon0.ast;

import java.util.List;
import org.elcid.oberon0.ast.util.NodeType;
import org.elcid.oberon0.ast.visitor.NodeVisitor;

/**
 * Represents a variable expression in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class VariableExpNode extends ExpressionNode {

	private IdentifierNode variableName;

	public VariableExpNode(IdentifierNode variableName) {
		this.variableName = variableName;
	}

	public IdentifierNode getValue() {
		return variableName;
	}

	@Override
	public List<Node> childNodes() {
		return createList(variableName);
	}

	@Override
	public Object accept(NodeVisitor visitor) {
		return visitor.visitVariableExpNode(this);
	}

	@Override
	public NodeType getNodeType() {
		return NodeType.VARIABLEEXPNODE;
	}
}
