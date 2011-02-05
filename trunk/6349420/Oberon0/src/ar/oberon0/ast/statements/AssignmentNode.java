package ar.oberon0.ast.statements;

import junit.framework.Assert;
import ar.oberon0.ast.expression.VarSelectorNode;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.Helper;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.Value;

/*
 * Node that executes the logic of an oberon 0 assignment. It takes a selector for selection the variable to set
 * and an interpretable node (expression) that evaluates to a value to set in the variable (DataField).
 */
public class AssignmentNode implements Interpretable {
	private VarSelectorNode varSelector;
	private Interpretable value;

	public AssignmentNode(final VarSelectorNode varSelector, final Interpretable value) {
		Assert.assertNotNull("The varSelector parameter can't be null", varSelector);
		Assert.assertNotNull("The value parameter can't be null", value);
		this.varSelector = varSelector;
		this.value = value;
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		// Get the actualValue (instance of Value) to insert into the variable.
		Value actualValue = Helper.getValue(this.value, context);
		Assert.assertNotNull("The actualValue can't be null", actualValue);

		// Get the variable to set.
		Object rawVariable = this.varSelector.interpret(context);
		Assert.assertTrue("The object returned by the ident selector was not of the type DataField", rawVariable instanceof DataField);

		// Set the value of the variable.
		((DataField) rawVariable).setValue(actualValue, context);
		return 0;
	}
}
