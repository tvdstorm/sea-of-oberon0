package jdm.oberon0.ast.expressions;

public class EqExpression extends BinaryExpression {

	
	public EqExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitEqExpression(this);
	}

}
