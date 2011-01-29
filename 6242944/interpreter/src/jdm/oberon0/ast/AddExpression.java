package jdm.oberon0.ast;

public class AddExpression extends BinaryExpression {
	
	public AddExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
