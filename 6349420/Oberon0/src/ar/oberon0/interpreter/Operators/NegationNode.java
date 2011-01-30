package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.Memory.Context;

public class NegationNode implements Interpretable
{
	private Interpretable _nodeToNegate;

	public NegationNode(Interpretable nodeToNegate)
	{
		_nodeToNegate = nodeToNegate;
	}

	@Override
	public Object Interpret(Context context) throws TechnicalException
	{
		return ((DataType) _nodeToNegate.Interpret(context)).Negate();
	}

}
