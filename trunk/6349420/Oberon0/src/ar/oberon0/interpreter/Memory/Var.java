package ar.oberon0.interpreter.Memory;

import ar.oberon0.interpreter.Memory.*;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.DataTypes.Type;

public class Var implements Interpretable
{

	private Type _type;
	private DataType _value;
	
	public Var(Type type)
	{
		this(type,null);
	}
	
	public Var(Type type, DataType value)
	{
		_type = type;
		_value = value;
	}
	
	public DataType getValue()
	{
		return _value;
	}

	public void setValue(Context context, DataType value) 
	{
		_value = value;
	}

	@Override
	public Object Interpret(Context context) throws Exception {
		return getValue();
	}

}
