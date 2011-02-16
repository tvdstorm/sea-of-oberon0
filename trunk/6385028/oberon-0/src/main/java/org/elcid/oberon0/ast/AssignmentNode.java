package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitors.StatementVisitor;

/**
 * Represents an assignment in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class AssignmentNode extends StatementNode {

	private IdentSelectorNode identSelector;
	private ExpressionNode expression;

	public AssignmentNode(IdentSelectorNode variableName, ExpressionNode expression) {
		this.identSelector = variableName;
		this.expression = expression;
	}

	public ExpressionNode getExpression() {
		return expression;
	}

	public IdentSelectorNode getIdentSelector() {
		return identSelector;
	}

	@Override
	public void run(StatementVisitor visitor, Environment localEnv) {
		visitor.run(this, localEnv);
	}

}
