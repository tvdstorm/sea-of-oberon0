package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitor.BaseVisitor;

/**
 * Represents an assignment in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class AssignmentNode extends StatementNode {

	private String variableName;
	private ExpressionNode expression;

	public AssignmentNode(String variableName, ExpressionNode expression) {
		this.variableName = variableName;
		this.expression = expression;
	}

	public ExpressionNode getExpression() {
		return expression;
	}

	public String getVariableName() {
		return variableName;
	}

	@Override
	public void run(BaseVisitor visitor, Environment localEnv) {
		visitor.run(this, localEnv);
	}

}
