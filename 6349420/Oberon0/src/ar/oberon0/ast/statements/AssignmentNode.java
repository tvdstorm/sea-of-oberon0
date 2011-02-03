package ar.oberon0.ast.statements;

import ar.oberon0.ast.expression.VarSelectorNode;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.Helper;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.Value;

/*
 * Node that executes the logic of an oberon 0 assignment. It takes a selector for selection the variable to set
 * and an interpretable node that evaluates to a value to set in the variable (DataField).
 */
public class AssignmentNode implements Interpretable {
	private VarSelectorNode variable;
	private Interpretable value;

	public AssignmentNode(final VarSelectorNode variable, final Interpretable value) {
		this.variable = variable;
		this.value = value;
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		if (this.variable == null) {
			throw new NullPointerException("The variable in the assignment node can't be null.");
		}

		// Get the variable to set.
		Object rawVariable = this.variable.interpret(context);
		if (!(rawVariable instanceof DataField)) {
			throw new TechnicalException("The object returned by the ident selector was not of the type DataField.");
		}

		DataField variable = (DataField) rawVariable;
		// Get the value to insert into the variable.
		Value value = Helper.getValue(this.value, context);
		// Set the value of the variable.
		variable.setValue(value, context);
		return 0;
	}
}
