package ar.oberon0.ast.expression;

import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.Helper;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.Array;
import ar.oberon0.values.IntegerNode;
import ar.oberon0.values.Value;

/*
 * This class is used to get the DataField of a array item.
 * An expression is to indicate the location within the array.
 */
public class ArrayItemSelectorNode extends SelectorNode {
	/*
	 * The expression that gives the location within the array.
	 */
	private Interpretable locationExpression;

	/*
	 * Create a new ArrayItemSelector and use the expression when interpreted to
	 * find the location within the array to return.
	 */
	public ArrayItemSelectorNode(final Interpretable expression) {
		this.locationExpression = expression;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.Memory.Selector#getVar(ar.oberon0.interpreter.
	 * Memory.DataField, ar.oberon0.interpreter.Memory.Context)
	 */
	@Override
	protected final DataField getItem(final DataField parent, final Context context) throws TechnicalException {
		if (parent == null) {
			throw new IllegalArgumentException("Parent can't be null.");
		}
		if (!(parent.getValue(context) instanceof Array)) {
			throw new IllegalArgumentException("The parent parameter doesn't contain an Array.");
		}

		Value expressionResult = Helper.getValue(this.locationExpression, context);
		if (!(expressionResult instanceof IntegerNode)) {
			throw new TechnicalException("The array indexer is not a valid integer datatype.");
		}
		DataField currentField = ((Array) parent.getValue(context)).getDataFieldAt((IntegerNode) expressionResult);
		if (this.getNextNode() == null) {
			return currentField;
		}
		return this.getNextNode().getItem(currentField, context);
	}
}
