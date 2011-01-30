package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;

public class NotEqualNode extends BinaryNode
{
	public NotEqualNode(Interpretable leftNode, Interpretable rightNode)
	{
		super(leftNode, rightNode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object Interpret(Context context) throws TechnicalException
	{
		int compareResult = getLeftValue(context).compareTo(getRightValue(context));
		return compareResult != 0;
	}

}
