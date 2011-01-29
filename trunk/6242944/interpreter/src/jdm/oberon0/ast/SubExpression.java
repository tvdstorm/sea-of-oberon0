package jdm.oberon0.ast;

public class SubExpression extends BinaryExpression {
	
	public SubExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

}
