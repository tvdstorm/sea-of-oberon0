package ar.oberon0.interpreter.Lists;

import java.util.Map.Entry;

import ar.oberon0.interpreter.DataTypes.CreatableType;
import ar.oberon0.interpreter.Memory.DataField;

/*
 * A list that is used to store name DataField data. DataFields can be looked up by their name. For example used in the context to store the variables.
 */
public class DataFieldList extends BaseMap<DataField> {
	/*
	 * Create a new empty DataFieldList.
	 */
	public DataFieldList() {
		super();
	}

	/*
	 * Clone this list. For each DataField in the list a new DataField is
	 * created. This is used when a procedure with call by value parameters is
	 * invoked. If this isn't done the parameters are semantically passed by
	 * reference.
	 */
	public final DataFieldList clone() {
		DataFieldList clone = new DataFieldList();
		for (Entry<String, DataField> item : this) {
			DataField tempField = item.getValue().clone();
			clone.addItem(item.getKey(), tempField);
		}
		return clone;
	}

	/*
	 * Add a item to the list for each identifier in the list. The type
	 * specified is used to create the instance. For example a variable named i
	 * of type IntegerNode.
	 */
	public final void addVariables(final IdentList identifiers, final CreatableType type) {
		for (String identifier : identifiers) {
			addItem(identifier, new DataField(type));
		}
	}

}
