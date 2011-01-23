package ar.oberon0.interpreter.Memory;

import ar.oberon0.interpreter.DataTypes.Array;
import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.DataTypes.IntegerNode;
import ar.oberon0.interpreter.Memory.*;
import ar.oberon0.interpreter.Interpretable;

public class ArrayItemSelector extends Selector {

	private Interpretable _expression;
	
	public ArrayItemSelector(Interpretable expression)
	{
		_expression = expression;
	}

	@Override
	protected DataField getVar(DataField parent, Context context) throws Exception 
	{
		return ((Array)parent.getValue(context)).getVarAt((IntegerNode)_expression.Interpret(context));
	}

	
	
}
