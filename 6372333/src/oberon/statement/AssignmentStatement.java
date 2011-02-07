package oberon.statement;

import oberon.IDataType;
import oberon.IExpression;
import oberon.IIdentifier;
import oberon.IStatement;
import oberon.Scope;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Class AssignmentStatement, contains an assignment of a value to an identifier.
 */
public class AssignmentStatement implements IStatement {
	
	/** The identifier to assign to. */
	private final IIdentifier identifierToAssignTo;
	
	/** The assignment expression. */
	private final IExpression assignmentExpression;

	/**
	 * Instantiates a new assignment statement.
	 *
	 * @param name the name of the identifier
	 * @param value the value expression
	 */
	public AssignmentStatement(final IIdentifier name, final IExpression value){		
		identifierToAssignTo = name;
		assignmentExpression = value;
	}
	
	/* (non-Javadoc)
	 * @see oberon.IStatement#eval()
	 */
	@Override
	public void eval(final Scope currentScope) throws UnsupportedException, VariableNotFoundInScopeException {
		final IDataType type = identifierToAssignTo.getDataTypeValue(currentScope);
		type.setValue(assignmentExpression.evalAsInt(currentScope));
	}

}
