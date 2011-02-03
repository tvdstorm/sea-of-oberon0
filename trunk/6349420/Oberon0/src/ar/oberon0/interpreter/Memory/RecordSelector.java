package ar.oberon0.interpreter.Memory;

import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.DataTypes.LookupType;
import ar.oberon0.interpreter.DataTypes.RecordType;
import ar.oberon0.interpreter.DataTypes.RecordValue;

public class RecordSelector extends Selector {

	/*
	 * The name to look for in the context (memory).
	 */
	private String identName;

	/*
	 * Create a new IdentSelector that is going to look for the variable,
	 * constant, etc. with the specified name.
	 */
	public RecordSelector(final String identName) {
		this.identName = identName;
	}

	@Override
	protected DataField getItem(DataField parent, Context context) throws TechnicalException {
		if (!(parent.getType() instanceof RecordType) && parent.getType().getClass() != LookupType.class) {
			throw new TechnicalException("The parent type that was passed to the record selector was not of the record type.");
		}
		DataField currentField = ((RecordValue) parent.getValue(context)).getMember(this.identName);

		if (this.getNextNode() == null) {
			return currentField;
		}
		return this.getNextNode().getItem(currentField, context);
	}
}
