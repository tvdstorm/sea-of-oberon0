package ar.oberon0.shared;

import ar.oberon0.ast.expression.SelectorNode;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.values.Value;

/*
 * This class contains some generic helper functions to work with DataFields and DataTypes.
 */
public final class Helper {

	/*
	 * This class contains only static helper functions. This class can't be
	 * instantiated.
	 */
	private Helper() {
	}

	public static boolean areSameType(final Object o1, final Object o2) {
		if (o1.getClass() == o2.getClass()) {
			return true;
		}
		return false;
	}

	/*
	 * Recursively invokes interpretable on the node object until it reaches a
	 * value. This value is returned. This function can be used to get the value
	 * of a DataField or expression. If a node doesn't contain a descendant node
	 * that contains a value it will returns null.
	 */
	public static <T extends Value> T getValue(final Interpretable node, final Context context) {
		Object tempNode = node;
		while (!(tempNode instanceof Value)) {
			if (!(tempNode instanceof Interpretable)) {
				return null;
			}
			tempNode = ((Interpretable) tempNode).interpret(context);

		}
		return (T) tempNode; // Caution because java uses type erasure with
								// generics this cast is not compile time
								// checked to T but to Value (the base of T).
	}

	/*
	 * This function returns the node or the first node of the children that is
	 * of the type DataField. If the leaf node is a DataType it is wrapped in a
	 * new DataField object. The purpose of this function is to alway's return a
	 * DataField even if the leaf node is a DataType that is not contained in a
	 * DataField. This function can be used to create the parameter list for a
	 * procedure call.
	 */
	public static DataField convertToDataField(final Interpretable node, final Context context) throws TechnicalException {
		assert node != null : "The node parameter can't be null";

		if (node instanceof DataField) {
			return (DataField) node;
		} else if (node instanceof SelectorNode) {
			// the value returned by a selector is always of the type DataField.
			return (DataField) node.interpret(context);
		} else {
			Value interpretResult = Helper.getValue(node, context);
			if (interpretResult == null) {
				throw new IllegalArgumentException("the node or one of it's children could not be converted into a DataField object.");
			}
			return new DataField(interpretResult.getType(), interpretResult);
		}

	}
}
