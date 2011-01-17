package ar.oberon0.interpreter;

public class AddExpression extends BinaryExpression {

	protected AddExpression(Interpretable leftExpression, Interpretable rightExpression) 
	{
		super(leftExpression, rightExpression);
	}

	@Override
	public Object Interpret() 
	{
		return null;
	}


}
