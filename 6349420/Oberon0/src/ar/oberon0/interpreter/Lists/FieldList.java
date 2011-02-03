package ar.oberon0.interpreter.Lists;

import java.util.List;

import ar.oberon0.interpreter.DataTypes.CreatableType;

/*
 * Not yet implemented.
 */
public class FieldList {

	private IdentList fieldNames;
	private CreatableType type;

	public List<String> getFieldNames() {
		return this.fieldNames.getIdentifiers();
	}

	public CreatableType getType() {
		return this.type;
	}

	public FieldList(final IdentList fieldNames, final CreatableType type) {
		this.fieldNames = fieldNames;
		this.type = type;
	}

}
