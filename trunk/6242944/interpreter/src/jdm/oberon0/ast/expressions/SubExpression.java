package jdm.oberon0.ast.expressions;


public class SubExpression extends BinaryExpression {
	
	public SubExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitSubExpression(this);
	}
}
