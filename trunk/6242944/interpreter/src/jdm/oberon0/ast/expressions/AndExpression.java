package jdm.oberon0.ast.expressions;


public class AndExpression extends BinaryExpression {
	
	public AndExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitAndExpression(this);
	}
}
