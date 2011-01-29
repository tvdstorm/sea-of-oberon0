package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.Memory.Context;

public class CompareNode extends BinaryNode implements Interpretable
{

	private CompareOperator _compareOperator;

	public CompareNode(Interpretable leftExpression, Interpretable rightExpression, CompareOperator compareOperator)
	{
		super(leftExpression, rightExpression);
		_compareOperator = compareOperator;
	}

	@Override
	public Object Interpret(Context context) throws Exception
	{
		int compareResult = getLeftValue(context).compareTo(getRightValue(context));
		if (_compareOperator == CompareOperator.EQUAL)
			return compareResult == 0;
		if (_compareOperator == CompareOperator.GREATER)
			return compareResult > 0;
		if (_compareOperator == CompareOperator.GREATER_OR_EQUAL)
			return compareResult >= 0;
		if (_compareOperator == CompareOperator.SMALLER)
			return compareResult < 0;
		if (_compareOperator == CompareOperator.SMALLER_OR_EQUAL)
			return compareResult <= 0;
		throw new Exception("Compare opperator does not exist.");
	}

}
