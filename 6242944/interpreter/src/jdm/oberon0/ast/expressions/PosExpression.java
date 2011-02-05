package jdm.oberon0.ast.expressions;


public class PosExpression extends UnaryExpression {

	public PosExpression(Expression argument) {
		super(argument);
	}
	
	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitPosExpression(this);
	}
}
