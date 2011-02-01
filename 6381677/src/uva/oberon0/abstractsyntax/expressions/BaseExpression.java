package uva.oberon0.abstractsyntax.expressions;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;

/**
 * @author Chiel Labee
 * This class represents a Expression.
*/
public abstract class BaseExpression extends BaseNode 
{	
	public BaseExpression(CommonTree parserTree) 
	{
		super(parserTree);
	}

}
