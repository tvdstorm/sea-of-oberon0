package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;

public class ArrayType implements CreatableType
{
	private Interpretable _length;
	private CreatableType _type;

	public ArrayType(Interpretable length, CreatableType type)
	{
		_length = length;
		_type = type;
	}

	@Override
	public DataType createInstance(Context context) throws TechnicalException
	{
		IntegerNode length = (IntegerNode) Helper.getDataType((Interpretable) _length.Interpret(context), context);
		return new Array(length, _type);
	}

}
