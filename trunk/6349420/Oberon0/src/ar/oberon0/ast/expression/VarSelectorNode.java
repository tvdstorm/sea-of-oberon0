package ar.oberon0.ast.expression;

import junit.framework.Assert;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;

/*
 * The var selector is used to select a variable, constant, etc. form the context (memory).
 */
public class VarSelectorNode extends SelectorNode implements Interpretable {
	private String identName;

	public VarSelectorNode(final String identName) {
		this.identName = identName;
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		return getItem(null, context);
	}

	@Override
	protected final DataField getItem(final DataField parent, final Context context) throws TechnicalException {
		Assert.assertNull("The parent parameter must be null. A VarSelector can only occur as first selector.", parent);

		DataField resultVar = context.getVarOrConstantAsDataField(this.identName);
		// If there is no next selector node the resultField is the field that
		// was asked for.
		if (getNextNode() == null) {
			return resultVar;
		}
		// If there is a selector node invoke the next selector.
		return getNextNode().getItem(resultVar, context);

	}
}
