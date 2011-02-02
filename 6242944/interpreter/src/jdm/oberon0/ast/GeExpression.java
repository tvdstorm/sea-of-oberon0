package jdm.oberon0.ast;

public class GeExpression extends BinaryExpression {

	public GeExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitGeExpression(this);
	}

}