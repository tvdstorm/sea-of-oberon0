package uva.oberon0.abstractsyntax.declarations;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNodeWithID;


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
