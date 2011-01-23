package ar.oberon0.interpreter.Memory;

import ar.oberon0.interpreter.Memory.*;
import ar.oberon0.interpreter.Interpretable;

public class ArrayItemSelector extends Selector {

	private Interpretable _expression;
	
	public ArrayItemSelector(Interpretable expression)
	{
		_expression = expression;
	}

	@Override
	public Object Interpret(Context context) throws Exception {
		if(getNextNode() != null)
			return "[" + _expression.Interpret(context) + "]" + "." + getNextNode().Interpret(context);
		else
			return "[" + _expression.Interpret(context) + "]";
	}


	
}
