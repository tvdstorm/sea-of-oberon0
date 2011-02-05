package oberon.expressions;

import oberon.IDataType;
import oberon.IIdentifier;

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
	public IDataType copy(final String newName) {
		return selector.getDataTypeValue().copy(newName);
	}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.AbstractExpression#evalAsInt()
	 */
	@Override
	public int evalAsInt() {
		return selector.getValue();
	}

}
