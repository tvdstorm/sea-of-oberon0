package uva.oberon0.abstractsyntax.expressions;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;

public abstract class BaseExpressionBinary extends BaseExpression {

	public BaseExpressionBinary(BaseNode left, BaseNode right) 
	{
		_left = left;
		_right = right;
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
	public boolean isValid() {
		return _left != null && _right != null;
	}
}
