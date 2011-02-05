package jdm.oberon0.ast.expressions;


public class OrExpression extends BinaryExpression {
	
	public OrExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitOrExpression(this);
	}
}
