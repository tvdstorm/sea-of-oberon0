package oberon.statement;

import java.io.IOException;
import java.util.List;

import oberon.IExpression;
import oberon.IIdentifier;
import oberon.IStatement;
import oberon.Scope;

/**
 * The Class WithStatement.
 */
public class WithStatement implements IStatement {

	/** The identifier to with. */
	private final IIdentifier identifierToWith;
	
	/** The statemtent list. */
	private final List<WithAssignmentStatement> statemtentList;

	/**
	 * Instantiates a new with statement.
	 *
	 * @param identifierToWith the identifier to with
	 * @param statemtentList the statemtent list
	 */
	public WithStatement(final IIdentifier identifierToWith, 
			final List<WithAssignmentStatement> statemtentList){
				this.identifierToWith = identifierToWith;
				this.statemtentList = statemtentList;		
	}
	
	/* (non-Javadoc)
	 * @see oberon.IStatement#eval(oberon.Scope)
	 */
	@Override
	public void eval(Scope currentScope) throws IOException {
		for (WithAssignmentStatement statement : statemtentList){
			Scope newScope = currentScope.createNewScope(identifierToWith);
			statement.eval(newScope);
		}
	}

	/**
	 * Gets the identifier.
	 *
	 * @return the identifier
	 */
	public IIdentifier getIdentifier() {
		return identifierToWith;
	}

}
