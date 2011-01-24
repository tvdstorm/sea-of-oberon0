package ar.oberon0.interpreter;

import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.DataTypes.SimpleType;
import ar.oberon0.interpreter.DataTypes.CreatableType;
import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.DataField;
import ar.oberon0.interpreter.Memory.Selector;

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
	
	public static DataField ConvertToDataField(Interpretable node, Context context) throws Exception
	{
		if(node instanceof Selector)
		{
			return (DataField)node.Interpret(context);
		}
		if(node instanceof DataField)
		{
			return (DataField)node;
		}
		CreatableType type = new SimpleType("INTEGER");
		return new DataField(type, (DataType)Helper.getDataType(node,context));
	}
}
