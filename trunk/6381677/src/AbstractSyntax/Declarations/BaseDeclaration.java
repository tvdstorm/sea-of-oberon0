package AbstractSyntax.Declarations;

import org.antlr.runtime.tree.CommonTree;

import AbstractSyntax.BaseNodeWithID;

/**
 * @author Chiel Labee
 * This class represents a Declaration Node.
 * This class is abstract.
*/
public abstract class BaseDeclaration extends BaseNodeWithID 
{
	protected BaseDeclaration(CommonTree parserTree) 
	{
		super(parserTree);
	}
}
