package jdm.oberon0.ast;

public class NegExpression extends UnaryExpression {
	
	public NegExpression(Expression argument) {
		super(argument);
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitNegExpression(this);
	}
}
