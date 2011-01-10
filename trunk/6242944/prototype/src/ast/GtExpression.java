package ast;

public class GtExpression extends BinaryExpression {

	
	public GtExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

}
