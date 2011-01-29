package jdm.oberon0.ast;

public class AndExpression extends BinaryExpression {
	
	public AndExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
