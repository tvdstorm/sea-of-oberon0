package jdm.oberon0.ast;

public class PosExpression extends UnaryExpression {
	public PosExpression(Expression argument) {
		super(argument);
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
