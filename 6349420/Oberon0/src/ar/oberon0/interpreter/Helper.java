package ar.oberon0.interpreter;

import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.Memory.Context;

public class Helper {
	/*
	 * Returns the leaf dataType of a Interpretable. 
	 */
	public static DataType getDataType(Interpretable node, Context context)
	{
		Object tempNode = node;
		while(!(tempNode instanceof DataType))
			try 
			{
				tempNode = ((Interpretable)tempNode).Interpret(context);
			} catch (Exception e) 
			{
				e.printStackTrace();
				return null;
			}
		return (DataType)tempNode;
	}
}
