package ar.oberon0.interpreter;

public class CompareNode extends BinaryNode implements Interpretable {

	private CompareOperator _compareOperator;
	
	public CompareNode(Interpretable leftExpression, Interpretable rightExpression,CompareOperator compareOperator) 
	{
		super(leftExpression, rightExpression);
		_compareOperator = compareOperator;
	}

	@Override
	public Object Interpret() throws Exception 
	{
		if(_compareOperator == CompareOperator.EQUAL)
			return this.getLeftExpression().Interpret().equals(this.getRightExpression().Interpret());
		if(_compareOperator == CompareOperator.GREATER)
			return ((Comparable)this.getLeftExpression().Interpret()).compareTo(this.getRightExpression().Interpret()) > 0;
		if(_compareOperator == CompareOperator.GREATER_OR_EQUAL)
			return ((Comparable)this.getLeftExpression().Interpret()).compareTo(this.getRightExpression().Interpret()) >= 0;
		if(_compareOperator == CompareOperator.SMALLER)
			return ((Comparable)this.getLeftExpression().Interpret()).compareTo(this.getRightExpression().Interpret()) < 0;
		if(_compareOperator == CompareOperator.SMALLER_OR_EQUAL)
			return ((Comparable)this.getLeftExpression().Interpret()).compareTo(this.getRightExpression().Interpret()) <= 0;
		throw new Exception("Compare opperator does not exist.");
	}

}
