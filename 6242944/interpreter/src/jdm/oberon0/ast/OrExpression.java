package jdm.oberon0.ast;

public class OrExpression extends BinaryExpression {
	
	public OrExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitOrExpression(this);
	}
}
