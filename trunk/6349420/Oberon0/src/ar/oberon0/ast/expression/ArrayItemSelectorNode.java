package ar.oberon0.ast.expression;

import junit.framework.Assert;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.Helper;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.ArrayValue;
import ar.oberon0.values.IntegerValue;
import ar.oberon0.values.Value;

/*
 * This class is used to get the DataField of a array item.
 * An expression is used to get the location within the array.
 */
public class ArrayItemSelectorNode extends SelectorNode {

	private Interpretable locationExpression;

	public ArrayItemSelectorNode(final Interpretable expression) {
		this.locationExpression = expression;
	}

	/*
	 * Returns the DataField at the specified location. parent is the DataField
	 * that contains the full array.
	 */
	@Override
	protected final DataField getItem(final DataField parent, final Context context) throws TechnicalException {
		Assert.assertNotNull("The parent parameter can't be null. An ArrayItemSelector can't be the first selector.", parent);

		if (!(parent.getValue(context) instanceof ArrayValue)) {
			throw new IllegalArgumentException("The parent parameter doesn't contain a DataField with an Array.");
		}

		Value expressionResult = Helper.getValue(this.locationExpression, context);
		if (!(expressionResult instanceof IntegerValue)) {
			throw new TechnicalException("The array indexer is not a valid integer datatype.");
		}
		DataField resultField = ((ArrayValue) parent.getValue(context)).getDataFieldAt((IntegerValue) expressionResult);
		// If there is no next selector node the resultField is the field that
		// was asked for.
		if (this.getNextNode() == null) {
			return resultField;
		}
		// If there is a selector node invoke the next selector.
		return this.getNextNode().getItem(resultField, context);
	}
}
