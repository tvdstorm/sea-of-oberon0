package uva.oberon0.abstractsyntax.declarations;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;


/**
 * @author Chiel Labee
 * This class represents the Module, Procedure or Statements Body Structure.
*/
public class Body extends uva.oberon0.abstractsyntax.statements.BaseStatementList 
{
	public Body(CommonTree parserTree)
	{
		super(parserTree);
	}

	private BaseDeclarationList _declarations = null;
	/**
	 * Gets the Declarations List of the current Body Structure.
	 */
	public BaseDeclarationList getDeclarations()
	{
		return _declarations;
	}

	@Override
	protected boolean addChildNode(BaseNode child)
	{
		if (super.addChildNode(child))
			return true;
		
		if (child instanceof BaseDeclarationList)
		{
			_declarations = (BaseDeclarationList)child;
			return true;
		}
		
		return false;
	}
}
