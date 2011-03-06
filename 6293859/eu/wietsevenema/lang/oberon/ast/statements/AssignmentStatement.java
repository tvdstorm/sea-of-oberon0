package eu.wietsevenema.lang.oberon.ast.statements;

import eu.wietsevenema.lang.oberon.ast.expressions.Expression;

public class AssignmentStatement extends Statement {

	Expression identifier;
	Expression expression;

	public Expression getIdentifier() {
		return identifier;
	}

	public Expression getExpression() {
		return expression;
	}

	public AssignmentStatement(Expression id, Expression exp) {
		this.identifier = id;
		this.expression = exp;
	}

}
