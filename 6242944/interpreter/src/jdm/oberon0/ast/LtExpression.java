package jdm.oberon0.ast;

public class LtExpression extends BinaryExpression {
	
	public LtExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitLtExpression(this);
	}

}
