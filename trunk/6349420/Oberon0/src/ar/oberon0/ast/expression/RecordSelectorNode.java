package ar.oberon0.ast.expression;

import junit.framework.Assert;
import ar.oberon0.ast.dataTypes.LookupType;
import ar.oberon0.ast.dataTypes.RecordType;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.RecordValue;

public class RecordSelectorNode extends SelectorNode {

	private String identName;

	public RecordSelectorNode(final String identName) {
		this.identName = identName;
	}

	@Override
	protected DataField getItem(DataField parent, Context context) throws TechnicalException {
		Assert.assertNotNull("The parent parameter can't be null. A RecordSelector can't be the first selector.", parent);

		if (!(parent.getType() instanceof RecordType) && parent.getType().getClass() != LookupType.class) {
			throw new TechnicalException("The parent type that was passed to the record selector was not of the record type.");
		}
		DataField resultField = ((RecordValue) parent.getValue(context)).getMember(this.identName);

		// If there is no next selector node the resultField is the field that
		// was asked for.
		if (this.getNextNode() == null) {
			return resultField;
		}
		// If there is a next selector invoke the next selector.
		return this.getNextNode().getItem(resultField, context);
	}
}
