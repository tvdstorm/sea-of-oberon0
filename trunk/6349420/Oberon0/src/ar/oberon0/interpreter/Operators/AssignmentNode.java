package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.DataTypes.Value;
import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.DataField;
import ar.oberon0.interpreter.Memory.IdentSelector;

/*
 * Node that executes the logic of an oberon 0 assignment. It takes a selector for selection the variable to set
 * and an interpretable node that evaluates to a value to set in the variable (DataField).
 */
public class AssignmentNode implements Interpretable {
	private IdentSelector variable;
	private Interpretable value;

	public AssignmentNode(final IdentSelector variable,
			final Interpretable value) {
		this.variable = variable;
		this.value = value;
	}

	@Override
	public final Object interpret(final Context context)
			throws TechnicalException {
		if (this.variable == null) {
			throw new NullPointerException(
					"The variable in the assignment node can't be null.");
		}

		// Get the variable to set.
		Object rawVariable = this.variable.interpret(context);
		if (!(rawVariable instanceof DataField)) {
			throw new TechnicalException(
					"The object returned by the ident selector was not of the type DataField.");
		}

		DataField variable = (DataField) rawVariable;
		// Get the value to insert into the variable.
		Value value = Helper.getValue(this.value, context);
		// Set the value of the variable.
		variable.setValue(value, context);
		return 0;
	}
}
