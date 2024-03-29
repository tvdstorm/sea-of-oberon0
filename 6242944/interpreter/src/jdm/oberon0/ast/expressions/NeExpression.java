package jdm.oberon0.ast.expressions;


public class NeExpression extends BinaryExpression {
	
	public NeExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitNeExpression(this);
	}
}
