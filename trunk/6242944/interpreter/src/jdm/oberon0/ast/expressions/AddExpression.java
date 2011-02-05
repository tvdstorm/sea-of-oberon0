package jdm.oberon0.ast.expressions;


public class AddExpression extends BinaryExpression {
	
	public AddExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitAddExpression(this);
	}
}
