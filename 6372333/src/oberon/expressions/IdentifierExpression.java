package oberon.expressions;

import oberon.IDataType;
import oberon.IIdentifier;
import oberon.Scope;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Class IdentifierExpression, for selectors contained in expressions.
 */
public class IdentifierExpression extends AbstractExpression {
	
	/** The selector. */
	private final IIdentifier selector;

	/**
	 * Instantiates a new identifier expression.
	 *
	 * @param identifierExp the identifier expression
	 */
	public IdentifierExpression(final IIdentifier identifierExp) {
		selector = identifierExp;
	}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.AbstractExpression#copy(java.lang.String)
	 */
	public IDataType copy(final Scope currentScope, final String newName) throws UnsupportedException, VariableNotFoundInScopeException {
		return selector.getDataTypeValue(currentScope).performDeepCopy(newName);
	}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.AbstractExpression#evalAsInt()
	 */
	@Override
	public int evalAsInt(final Scope currentScope) throws UnsupportedException, VariableNotFoundInScopeException {
		return selector.getValue(currentScope);
	}

}
