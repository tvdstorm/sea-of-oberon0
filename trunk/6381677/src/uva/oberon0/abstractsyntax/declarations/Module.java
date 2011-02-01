package uva.oberon0.abstractsyntax.declarations;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.statements.BaseStatementList;


/**
 * @author Chiel Labee
 * This class represents the primairy Module Structure.
*/
public class Module extends uva.oberon0.abstractsyntax.BaseNodeWithID
{
	public Module(CommonTree parserTree)
	{
		super(parserTree);
	}
	
	private BaseDeclarationList _declarations = null;
	public BaseDeclarationList getDeclarations()
	{
		return _declarations;
	}
	
	private BaseStatementList _statements = null;
	public BaseStatementList getStatements()
	{
		return _statements;
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

		if (child instanceof BaseStatementList)
		{
			_statements = (BaseStatementList)child;
			return true;
		}
		
		return false;
	}
	
	@Override
	public boolean isValid()
	{
		return super.isValid()
		&& _statements != null;
	}
	
	public int eval()
	{
		uva.oberon0.runtime.Scope scope = new uva.oberon0.runtime.Scope(_declarations, null);
		return eval(scope);
	}
	
	@Override
	public int eval(uva.oberon0.runtime.Scope scope)
	{
		return _statements.eval(scope);
	}
}
