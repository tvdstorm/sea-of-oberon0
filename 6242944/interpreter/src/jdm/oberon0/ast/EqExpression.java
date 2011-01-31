package jdm.oberon0.ast;

public class EqExpression extends BinaryExpression {

	
	public EqExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitEqExpression(this);
	}

}
