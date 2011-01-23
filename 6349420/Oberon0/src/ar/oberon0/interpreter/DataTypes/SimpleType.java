package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.Memory.Context;

public class SimpleType extends Type 
{
	private String _typeName;
	
	public String getTypeName()
	{
		return _typeName;
	}
	
	public SimpleType(String typeName)
	{
		_typeName = typeName;
	}

	@Override
	public DataType createInstance(Context context) throws Exception 
	{
		if(_typeName.equals("INTEGER"))
			return new IntegerNode();
		throw new Exception("Simple type " + _typeName + " is not supported");			
	}
}
