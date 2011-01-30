package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;

public class SmallerNode extends BinaryNode
{
	public SmallerNode(Interpretable leftNode, Interpretable rightNode)
	{
		super(leftNode, rightNode);
	}

	@Override
	public Object Interpret(Context context) throws TechnicalException
	{
		int compareResult = getLeftValue(context).compareTo(getRightValue(context));
		return compareResult < 0;
	}

}
