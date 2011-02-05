package jdm.oberon0.ast.expressions;

public class GtExpression extends BinaryExpression {

	public GtExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitGtExpression(this);
	}

}
