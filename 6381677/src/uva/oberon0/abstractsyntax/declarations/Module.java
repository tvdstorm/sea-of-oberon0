package uva.oberon0.abstractsyntax.declarations;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.BaseNodeWithID;
import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.abstractsyntax.statements.BaseStatementList;


/**
 * @author Chiel Labee
 * This class represents the primairy Module Structure.
*/
public class Module extends BaseNodeWithID
{
	public Module(ID id, BaseDeclarationList declarations, BaseStatementList statements)
	{
		super(id);
		
		_declarations = declarations;
		_statements = statements;
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
