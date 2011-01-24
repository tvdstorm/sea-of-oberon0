package ar.oberon0.interpreter.Memory;

import ar.oberon0.interpreter.Memory.*;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.DataTypes.CreatableType;

public class DataField implements Interpretable
{
	private CreatableType _type;
	private DataType _value;
	
	public DataField(CreatableType type)
	{
		this(type,null);
	}
	
	public DataField(CreatableType type, DataType value)
	{
		_type = type;
		_value = value;
	}
		
	public DataType getValue(Context context)
	{
		IfNotInitInit(context);
		return _value;
	}

	public void setValue(DataType value, Context context) 
	{
		IfNotInitInit(context);
		_value = value;
	}

	@Override
	public Object Interpret(Context context) throws Exception 
	{
		IfNotInitInit(context);
		return getValue(context);
	}
	
	private void IfNotInitInit(Context context)
	{
		if(_value == null)
		{
			try 
			{
				_value = _type.createInstance(context);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public DataField Clone() 
	{
		return new DataField(_type,_value);
	}

}
