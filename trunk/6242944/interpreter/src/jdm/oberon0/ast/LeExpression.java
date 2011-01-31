package jdm.oberon0.ast;

public class LeExpression extends BinaryExpression {

	public LeExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitLeExpression(this);
	}

}
