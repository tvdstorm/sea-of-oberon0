package uva.oberon0.abstractsyntax.statements;


/**
 * @author Chiel Labee
 * This class represents a Statement Node containing a Statements List.
 * This class is abstract.
 */
public abstract class BaseWithList extends BaseStatement {

	protected BaseWithList(BaseStatementList statements) 
	{
		super();
		_statements = statements;
	}

	private BaseStatementList _statements = null;
	protected BaseStatementList getStatements()
	{
		return _statements;
	}
	

	@Override
	public boolean isValid() 
	{
		return _statements != null;
	}

}
