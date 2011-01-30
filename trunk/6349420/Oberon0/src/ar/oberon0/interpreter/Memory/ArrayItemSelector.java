package ar.oberon0.interpreter.Memory;

import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.DataTypes.Array;
import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.DataTypes.IntegerNode;

/*
 * This class is used to get the DataField of a array item.
 * An expression is to indicate the location within the array.
 */
public class ArrayItemSelector extends Selector
{
	/*
	 * The expression that gives the location within the array.
	 */
	private Interpretable _locationExpression;

	/*
	 * Create a new ArrayItemSelector and use the expression when interpreted to
	 * find the location within the array to return.
	 */
	public ArrayItemSelector(Interpretable expression)
	{
		_locationExpression = expression;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.Memory.Selector#getVar(ar.oberon0.interpreter.
	 * Memory.DataField, ar.oberon0.interpreter.Memory.Context)
	 */
	@Override
	protected DataField getItem(DataField parent, Context context) throws TechnicalException
	{
		if (parent == null)
		{
			throw new IllegalArgumentException("Parent can't be null.");
		}
		if (!(parent.getValue(context) instanceof Array))
		{
			throw new IllegalArgumentException("The parent parameter doesn't contain an Array.");
		}

		DataType expressionResult = Helper.getDataType(_locationExpression, context);
		if (!(expressionResult instanceof IntegerNode))
		{
			throw new TechnicalException("The array indexer is not a valid integer datatype.");
		}
		return ((Array) parent.getValue(context)).getDataFieldAt((IntegerNode) expressionResult);
	}
}
