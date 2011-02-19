package oberon0.expression;

public abstract class BinaryExpression implements Expression{
	
	protected Expression operandLeft;
	protected Expression operandRight;
	
	public BinaryExpression(Expression operandLeft, Expression oprerandRight) {
		this.operandLeft = operandLeft;
		this.operandRight = oprerandRight;
	}
}
