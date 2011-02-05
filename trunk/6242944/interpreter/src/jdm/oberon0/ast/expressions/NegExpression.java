package jdm.oberon0.ast.expressions;


public class NegExpression extends UnaryExpression {
	
	public NegExpression(Expression argument) {
		super(argument);
	}
	
	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitNegExpression(this);
	}
}
