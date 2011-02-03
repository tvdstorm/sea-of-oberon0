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
	private final BaseDeclarationList _parameters;
	private final BaseDeclarationList _declarations;
	private final BaseStatementList _statements;

	public Procedure(ID id, BaseDeclarationList parameters, BaseDeclarationList declarations, BaseStatementList statements)
	{
		super(id);
		
		assert parameters 	!= null : "No Parameters are available for the current Procedure!";
		assert declarations != null : "No Declarations are available for the current Procedure!";
		assert statements 	!= null : "No Statements are available for the current Procedure!";
		
		_parameters = parameters;
		_declarations = declarations;
		_statements = statements;
	}

	/**
	 * Gets the number of formal Parameters.
	 */
	public int getParameterCount()
	{
		return _parameters.size();
	}
	
	/**
	 * Gets a specific formal Parameter based on the index number value.
	 */
	public BaseDeclaration getParameter(int index)
	{
		return _parameters.get(index);
	}
	public BaseDeclarationList getDeclarations()
	{
		return _declarations;
	}
	
	@Override
	public int eval(Scope scope)
	{
		return _statements.eval(scope);
	}
}
