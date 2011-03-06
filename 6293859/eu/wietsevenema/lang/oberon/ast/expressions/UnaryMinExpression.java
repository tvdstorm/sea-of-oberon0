package eu.wietsevenema.lang.oberon.ast.expressions;

public class UnaryMinExpression extends Expression {

	Expression child;

	public UnaryMinExpression(Expression child) {
		this.child = child;
	}

	public Expression getChild() {
		return child;
	}

}
