package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.BinaryNode;
import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.Memory.Context;

public class CompareNode extends BinaryNode implements Interpretable {

	private CompareOperator _compareOperator;
	
	public CompareNode(Interpretable leftExpression, Interpretable rightExpression,CompareOperator compareOperator) 
	{
		super(leftExpression, rightExpression);
		_compareOperator = compareOperator;
	}

	@Override
	public Object Interpret(Context context) throws Exception 
	{
		DataType leftValue = Helper.getDataType(this.getLeftExpression(), context);
		DataType rightValue = Helper.getDataType(this.getRightExpression(), context);
		
		if(_compareOperator == CompareOperator.EQUAL)
			return this.getLeftExpression().Interpret(context).equals(this.getRightExpression().Interpret(context));
		if(_compareOperator == CompareOperator.GREATER)
			return ((Comparable)leftValue).compareTo((Comparable)rightValue) > 0;
		if(_compareOperator == CompareOperator.GREATER_OR_EQUAL)
			return ((Comparable)leftValue).compareTo((Comparable)rightValue) >= 0;
		if(_compareOperator == CompareOperator.SMALLER)
			return ((Comparable)leftValue).compareTo((Comparable)rightValue) < 0;
		if(_compareOperator == CompareOperator.SMALLER_OR_EQUAL)
			return ((Comparable)leftValue).compareTo((Comparable)rightValue) <= 0;
		throw new Exception("Compare opperator does not exist.");
	}

}
