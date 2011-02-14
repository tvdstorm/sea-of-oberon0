package oberon.statement;

import oberon.IExpression;
import oberon.IIdentifier;
import oberon.IStatement;
import oberon.Scope;

/**
 * The Class WithAssignmentStatement.
 */
public class WithAssignmentStatement {
	
	/** The expression value. */
	private final IExpression expressionValue;
	
	/** The record indexer. */
	private IIdentifier recordIndexer;
	
	/**
	 * Instantiates a new with assignment statement.
	 *
	 * @param indexerIdentifier the indexer identifier
	 * @param expression the expression
	 */
	public WithAssignmentStatement(IIdentifier indexerIdentifier,
			IExpression expression) {
		recordIndexer = indexerIdentifier;
		expressionValue = expression;		
	}

	/* (non-Javadoc)
	 * @see oberon.IStatement#eval(oberon.Scope)
	 */
	public void eval(Scope currentScope) {
		recordIndexer.getDataTypeValue(currentScope).setValue(expressionValue.evalAsInt(currentScope));
	}

}
