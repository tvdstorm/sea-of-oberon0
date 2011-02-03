package ar.oberon0.ast.expression;

import ar.oberon0.ast.dataTypes.LookupType;
import ar.oberon0.ast.dataTypes.RecordType;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.RecordValue;

public class RecordSelectorNode extends SelectorNode {

	/*
	 * The name to look for in the context (memory).
	 */
	private String identName;

	/*
	 * Create a new IdentSelector that is going to look for the variable,
	 * constant, etc. with the specified name.
	 */
	public RecordSelectorNode(final String identName) {
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
