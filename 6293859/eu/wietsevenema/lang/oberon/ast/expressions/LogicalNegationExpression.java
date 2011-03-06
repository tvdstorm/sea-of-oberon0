package eu.wietsevenema.lang.oberon.ast.expressions;

public class LogicalNegationExpression extends Expression {

	private Expression child;

	public LogicalNegationExpression(Expression child) {
		this.child = child;
	}

	public Expression getChild() {
		return child;
	}

}
