package AbstractSyntax.Structure;

import org.antlr.runtime.tree.CommonTree;

import AbstractSyntax.BaseNode;
import AbstractSyntax.Declarations.BaseDeclarationList;
import AbstractSyntax.Statements.BaseStatementList;

/**
 * @author Chiel Labee
 * This class represents the primairy Module Structure.
*/
public class Module extends AbstractSyntax.BaseNodeWithID
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
		Execution.Scope scope = new Execution.Scope(_declarations, null);
		return eval(scope);
	}
	
	@Override
	public int eval(Execution.Scope scope)
	{
		return _statements.eval(scope);
	}
}
