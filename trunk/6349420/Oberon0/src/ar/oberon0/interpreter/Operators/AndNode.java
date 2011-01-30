package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;

public class AndNode extends BinaryNode
{

	public AndNode(Interpretable leftNode, Interpretable rightNode)
	{
		super(leftNode, rightNode);
	}

	@Override
	public Object Interpret(Context context) throws TechnicalException
	{
		return (Boolean) this.getLeftExpression().Interpret(context) && (Boolean) this.getRightExpression().Interpret(context);
	}

}
