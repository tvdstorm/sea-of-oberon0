package jdm.oberon0.ast;

public class ModExpression extends BinaryExpression {
	
	public ModExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitModExpression(this);
	}
}
