package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.Memory.Context;

public abstract class Type 
{
	public abstract DataType createInstance(Context context) throws Exception;
}
