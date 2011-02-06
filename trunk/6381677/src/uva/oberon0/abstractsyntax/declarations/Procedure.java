package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.statements.StatementList;
import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a Procedure Structure.
*/
public class Procedure extends Declaration 
{
	private final VariableList 			_parameters;
	private final DeclarationList 	_declarations;
	private final StatementList 	_statements;

	public Procedure(ID id, VariableList parameters, DeclarationList declarations, StatementList statements)
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
	public Declaration getParameter(int index)
	{
		return _parameters.get(index);
	}
	public DeclarationList getDeclarations()
	{
		return _declarations;
	}
	
	public int eval(Scope scope)
	{
		return _statements.eval(scope);
	}
}
