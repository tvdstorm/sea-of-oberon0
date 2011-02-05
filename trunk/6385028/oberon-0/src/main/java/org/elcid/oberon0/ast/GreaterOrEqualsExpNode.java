package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.util.NodeType;
import org.elcid.oberon0.ast.values.Environment;
import org.elcid.oberon0.ast.visitor.BaseVisitor;
import java.util.List;

/**
 * Represents the greater-than-or-equals expression in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class GreaterOrEqualsExpNode extends BooleanExpNode {

	private IntExpNode leftExp;
	private IntExpNode rightExp;

	public GreaterOrEqualsExpNode(IntExpNode leftExp, IntExpNode rightExp) {
		this.leftExp = leftExp;
		this.rightExp = rightExp;
	}

	public IntExpNode getLeftExp() {
		return leftExp;
	}

	public IntExpNode getRightExp() {
		return rightExp;
	}

	@Override
	public Boolean accept(BaseVisitor visitor, Environment localEnv) {
		return visitor.visitGreaterOrEqualsExpNode(this, localEnv);
	}

	@Override
	public List<Node> childNodes() {
		return createList(leftExp, rightExp);
	}

	@Override
	public NodeType getNodeType() {
		return NodeType.GREATEROREQUALSNODE;
	}

}
