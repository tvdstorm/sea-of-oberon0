package ar.oberon0.interpreter;

import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.DataField;
import ar.oberon0.interpreter.Memory.Selector;

/*
 * This class contains some generic helper functions to work with DataFields and DataTypes.
 */
public class Helper
{
	/*
	 * Check if both objects are of the same type.
	 */
	public static boolean AreSameType(Object o1, Object o2)
	{
		if (o1.getClass() == o2.getClass())
			return true;
		else
			return false;
	}

	/*
	 * Recursively invokes interpretable on the node object until it reaches a
	 * DataType. This datatype is returned. This function can be used to get the
	 * value of a DataField or expression. If a node doesn't contain a
	 * descendant node that contains a DataType it returns null.
	 */
	public static DataType getDataType(Interpretable node, Context context)
	{
		Object tempNode = node;
		while (!(tempNode instanceof DataType))
		{
			if (!(tempNode instanceof Interpretable))
			{
				return null;
			} else
			{
				// this try catch can't go wrong because the type is checked in
				// the if statement.
				// its mandatory in java to catch the cast exception so this try
				// catch is needed.
				try
				{
					tempNode = ((Interpretable) tempNode).Interpret(context);
				} catch (Exception e)
				{
					// unreachable code.
					e.printStackTrace();
				}
			}
		}
		return (DataType) tempNode;
	}

	/*
	 * This function returns the node or the first node of the children that is
	 * of the type DataField. If the leaf node is a DataType it is wrapped in a
	 * new DataField object. The purpose of this function is to alway's return a
	 * DataField even if the leaf node is a DataType that is not contained in a
	 * DataField. This function can be used to create the parameter list for a
	 * procedure call.
	 */
	public static DataField ConvertToDataField(Interpretable node, Context context) throws IllegalArgumentException, Exception
	{
		if (node == null)
		{
			throw new IllegalArgumentException("The node value can't be null");
		} else if (node instanceof DataField)
		{
			return (DataField) node;
		} else if (node instanceof Selector)
		{
			// the value returned by a selector is always of the type DataField.
			return (DataField) node.Interpret(context);
		} else
		{
			DataType interpretResult = (DataType) Helper.getDataType(node, context);
			if (interpretResult == null)
			{
				throw new IllegalArgumentException("the node or one of it's children could not be converted into a DataField object.");
			}
			return new DataField(interpretResult.getType(), interpretResult);
		}

	}
}
