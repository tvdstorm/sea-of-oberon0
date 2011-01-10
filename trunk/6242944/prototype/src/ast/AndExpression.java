package ast;

public class AndExpression extends BinaryExpression {
	
	public AndExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
