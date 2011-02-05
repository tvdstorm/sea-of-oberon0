package jdm.oberon0.ast.expressions;

public class LtExpression extends BinaryExpression {
	
	public LtExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitLtExpression(this);
	}

}
