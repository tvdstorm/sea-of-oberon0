package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.abstractsyntax.statements.BaseStatementList;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a Procedure Structure.
*/
public class Procedure extends BaseDeclaration 
{
	public Procedure(ID id, BaseDeclarationList parameters, BaseDeclarationList declarations, BaseStatementList statements)
	{
		super(id);
		
		_parameters = parameters;
		_declarations = declarations;
		_statements = statements;
	}
	private BaseDeclarationList _parameters = null;
	public BaseDeclarationList getParameters()
	{
		return _parameters;
	}
	/**
	 * Gets a specific Declaration from the Input Variables List based on the index number value.
	 */
	public BaseDeclaration getParameter(int index)
	{
		return _parameters.getItem(index);
	}
	private BaseDeclarationList _declarations = null;
	public BaseDeclarationList getDeclarations()
	{
		return _declarations;
	}
	
	private BaseStatementList _statements = null;
	/**
	 * Gets the Body Structure of the current Procedure.
	 */
	public BaseStatementList getBody()
	{
		return _statements;
	}
	
	@Override
	public boolean isValid()
	{
		return super.isValid()
		&& _statements != null;
	}
	
	@Override
	public int eval(Scope scope)
	{
		return _statements.eval(scope);
	}
}
