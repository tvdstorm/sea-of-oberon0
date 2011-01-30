package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.Memory.Context;

public class GreaterNode extends BinaryNode
{
	public GreaterNode(Interpretable leftNode, Interpretable rightNode)
	{
		super(leftNode, rightNode);
	}

	@Override
	public Object Interpret(Context context) throws Exception
	{
		int compareResult = getLeftValue(context).compareTo(getRightValue(context));
		return compareResult > 0;
	}

}
