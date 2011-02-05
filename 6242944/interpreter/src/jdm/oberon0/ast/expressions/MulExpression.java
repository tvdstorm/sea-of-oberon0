package jdm.oberon0.ast.expressions;


public class MulExpression extends BinaryExpression {
	
	public MulExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitMulExpression(this);
	}
}
