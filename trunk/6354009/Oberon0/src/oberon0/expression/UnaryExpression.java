package oberon0.expression;

public abstract class UnaryExpression implements Expression{
	
	protected Expression operand;
	
	public UnaryExpression(Expression operand) {
		this.operand = operand;
	}
}
