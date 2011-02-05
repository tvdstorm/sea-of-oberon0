package jdm.oberon0.ast.expressions;

public class DivExpression extends BinaryExpression {
	
	public DivExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitDivExpression(this);
	}
}
