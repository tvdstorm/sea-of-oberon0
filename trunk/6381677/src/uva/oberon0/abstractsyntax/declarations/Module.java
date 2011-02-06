package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.BaseNodeWithID;
import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.abstractsyntax.statements.BaseStatementList;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents the primairy Module Structure.
*/
public class Module extends BaseNodeWithID
{
	private final BaseDeclarationList 	_declarations;
	private final BaseStatementList 	_statements;

	public Module(ID id, BaseDeclarationList declarations, BaseStatementList statements)
	{
		super(id);
		
		assert declarations != null : "No Declarations are available for the current Module!";
		assert statements 	!= null : "No Statements are available for the current Module!";

		_declarations 	= declarations;
		_statements 	= statements;
	}
	
	/**
	 * Creates a new Execution Scope for this Module.
	 */
	public Scope createScope()
	{
		return new Scope(_declarations, null);
	}
	/**
	 * Performs interpreter evaluation for the current Module structure.
	 * Creates a new Execution Scope for this Module.
	 */
	public int eval()
	{
		return eval(createScope());
	}
	
	@Override
	public int eval(uva.oberon0.runtime.Scope scope)
	{
		return _statements.eval(scope);
	}
}
