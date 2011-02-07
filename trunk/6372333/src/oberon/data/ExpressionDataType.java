package oberon.data;

import oberon.IDataType;
import oberon.IExpression;
import oberon.Scope;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Class ExpressionDataType, class for storing a variable of type expression.
 */
public class ExpressionDataType extends AbstractDataType {
	
	/** The expression. */
	private final IExpression expression;

	/**
	 * Instantiates a new expression data type.
	 *
	 * @param name the name for the new instance
	 * @param inputExpression the expression
	 */
	public ExpressionDataType(final String name, final IExpression inputExpression) {
		super(name);
		expression = inputExpression;
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractDataType#getValue()
	 */
	@Override
	public int getValue(Scope currentScope) throws UnsupportedException, VariableNotFoundInScopeException {
		return expression.evalAsInt(currentScope);
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractDataType#copy(java.lang.String)
	 */
	@Override
	public IDataType copy(final String newName) {
		return new ExpressionDataType(newName, expression);
	}
}
