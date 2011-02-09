package oberon.expressions;

import oberon.IDataType;
import oberon.IIdentifier;
import oberon.Scope;

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
	public IDataType performShallowCopy(final Scope currentScope, final String newName) {
		return selector.getDataTypeValue(currentScope).performShallowCopy(newName);
	}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.AbstractExpression#evalAsInt()
	 */
	@Override
	public int evalAsInt(final Scope currentScope) {
		return selector.getValue(currentScope);
	}

	/**
	 * Perform deep copy.
	 *
	 * @param currentScope the current scope
	 * @param newName the new name
	 * @return the data type
	 */
	public IDataType performDeepCopy(Scope currentScope, String newName) {
		return selector.getDataTypeValue(currentScope).performDeepCopy(newName);
	}

}
