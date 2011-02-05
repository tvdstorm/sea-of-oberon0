package jdm.oberon0.ast.expressions;


public class ModExpression extends BinaryExpression {
	
	public ModExpression(Expression lhs, Expression rhs) {
		super(lhs, rhs);
	}

	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitModExpression(this);
	}
}
