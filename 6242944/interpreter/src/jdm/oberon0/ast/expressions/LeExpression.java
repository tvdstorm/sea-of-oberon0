package jdm.oberon0.ast.expressions;

public class LeExpression extends BinaryExpression {

	public LeExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitLeExpression(this);
	}

}
