package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.Memory.Context;

public class ArrayType extends Type
{
	private Interpretable _length;
	private Type _type;
	
	public ArrayType(Interpretable length, Type type) 
	{
		_length = length;
		_type = type;
	}

	@Override
	public DataType createInstance(Context context) throws Exception 
	{
		IntegerNode length = (IntegerNode)Helper.getDataType((Interpretable)_length.Interpret(context), context);
		return new Array(length, _type,context);
	}


}
