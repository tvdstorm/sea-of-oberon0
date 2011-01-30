package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.Memory.Context;

/*
 * The base class for binary nodes. Nodes that contain a right and left node. For example an add node.
 */
abstract class BinaryNode implements Interpretable
{
	private Interpretable _leftNode;
	private Interpretable _rightNode;

	protected Interpretable getLeftExpression()
	{
		return _leftNode;
	}

	protected DataType getLeftValue(Context context)
	{
		return Helper.getDataType(_leftNode, context);
	}

	protected Interpretable getRightExpression()
	{
		return _rightNode;
	}

	protected DataType getRightValue(Context context)
	{
		return Helper.getDataType(_rightNode, context);
	}

	protected BinaryNode(Interpretable leftNode, Interpretable rightNode)
	{
		_leftNode = leftNode;
		_rightNode = rightNode;
	}
}
