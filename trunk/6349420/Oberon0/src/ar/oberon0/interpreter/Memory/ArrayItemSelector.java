package ar.oberon0.interpreter.Memory;

import ar.oberon0.interpreter.DataTypes.Array;
import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.DataTypes.IntegerNode;
import ar.oberon0.interpreter.Memory.*;
import ar.oberon0.interpreter.Helper;
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
		DataType expressionResult = Helper.getDataType(_expression, context);
		if(!(expressionResult instanceof IntegerNode))
		{
			throw new Exception("The array indexer is not a valid integer datatype.");
		}		
		return ((Array)parent.getValue(context)).getVarAt((IntegerNode)expressionResult);
	}

	
	
}
