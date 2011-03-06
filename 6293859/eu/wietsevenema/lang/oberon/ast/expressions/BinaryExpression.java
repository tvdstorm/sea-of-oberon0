package eu.wietsevenema.lang.oberon.ast.expressions;

abstract public class BinaryExpression extends Expression {

	private Expression left, right;

	public Expression getLeft() {
		return left;
	}

	public Expression getRight() {
		return right;
	}

	public BinaryExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

}
