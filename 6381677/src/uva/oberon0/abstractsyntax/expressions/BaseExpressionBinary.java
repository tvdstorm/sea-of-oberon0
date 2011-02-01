package uva.oberon0.abstractsyntax.expressions;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;

public abstract class BaseExpressionBinary extends BaseExpression {

	public BaseExpressionBinary(CommonTree parserTree) {
		super(parserTree);
	}
	
	private BaseNode _left = null;
	/**
	 * Gets the Left part of the Expression.
	 */
	public BaseNode getLeft()
	{
		return _left;
	}
	
	private BaseNode _right = null;
	/**
	 * Gets the Right part of the Expression.
	 */
	public BaseNode getRight()
	{
		return _right;
	}
	
	@Override
	protected boolean addChildNode(BaseNode child)
	{
		if (_left == null)
		{
			_left = (BaseNode)child;
			return true;
		}

		if (_right == null)
		{
			_right = (BaseNode)child;
			return true;
		}
		
		return false;
	}

}
