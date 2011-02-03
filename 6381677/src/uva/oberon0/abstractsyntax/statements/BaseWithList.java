package uva.oberon0.abstractsyntax.statements;


/**
 * @author Chiel Labee
 * This class represents a Statement Node containing a Statements List.
 * This class is abstract.
 */
public abstract class BaseWithList extends BaseStatement {
	private final BaseStatementList _statements;

	protected BaseWithList(BaseStatementList statements) 
	{
		super();
		
		assert statements != null : "No Statement List is available for the current Node!";
		
		_statements = statements;
	}

	protected BaseStatementList getStatements()
	{
		return _statements;
	}
}
