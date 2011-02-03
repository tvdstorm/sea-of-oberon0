package uva.oberon0.abstractsyntax.expressions;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;

public abstract class BaseExpressionUnary extends BaseExpression {

	protected BaseExpressionUnary(BaseNode argument)
	{
		_argument = argument;
	}
	
	private BaseNode _argument = null;
	/**
	 * Gets the Argument part of the Unary Expression.
	 */
	public BaseNode getArgument()
	{
		return _argument;
	}
	

	@Override
	public boolean isValid() {
		return _argument != null;
	}
}
