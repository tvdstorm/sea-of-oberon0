package jdm.oberon0.ast;

public class NotExpression extends UnaryExpression {
	
	public NotExpression(Expression argument) {
		super(argument);
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitNotExpression(this);
	}
}
