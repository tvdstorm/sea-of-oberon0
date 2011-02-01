package uva.oberon0.abstractsyntax.expressions;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;

public abstract class BaseExpressionUnary extends BaseExpression {

	public BaseExpressionUnary(CommonTree parserTree) {
		super(parserTree);
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
	protected boolean addChildNode(BaseNode child)
	{
		if (_argument == null)
		{
			_argument = (BaseNode)child;
			return true;
		}
		
		return false;
	}

}
