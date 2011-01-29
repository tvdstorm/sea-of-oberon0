package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.Memory.Context;

public class MinNode extends BinaryNode
{

	public MinNode(Interpretable leftNode, Interpretable rightNode)
	{
		super(leftNode, rightNode);
	}

	@Override
	public Object Interpret(Context context) throws Exception
	{
		return getLeftValue(context).Subtract(getRightValue(context));
	}

}
