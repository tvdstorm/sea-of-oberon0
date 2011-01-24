package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.Memory.Context;

public interface CreatableType 
{
	public DataType createInstance(Context context) throws Exception;
}
