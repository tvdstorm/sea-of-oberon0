package jdm.oberon0.ast;

public class MulExpression extends BinaryExpression {
	
	public MulExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitMulExpression(this);
	}
}
