package jdm.oberon0.ast.expressions;

public class GeExpression extends BinaryExpression {

	public GeExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitGeExpression(this);
	}

}
