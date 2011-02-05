package jdm.oberon0.ast.expressions;


public class NotExpression extends UnaryExpression {
	
	public NotExpression(Expression argument) {
		super(argument);
	}
	
	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitNotExpression(this);
	}
}
