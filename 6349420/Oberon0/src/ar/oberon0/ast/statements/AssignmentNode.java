package ar.oberon0.ast.statements;

import java.util.ArrayList;
import java.util.List;

import ar.oberon0.ast.expression.VarSelectorNode;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.CheckViolation;
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
		assert varSelector != null : "The varSelector parameter can't be null";
		assert value != null : "The value parameter can't be null";
		this.varSelector = varSelector;
		this.value = value;
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		// Get the actualValue (instance of Value) to insert into the variable.
		Value actualValue = Helper.getValue(this.value, context);
		assert actualValue != null : "The actualValue can't be null";

		// Set the value of the variable.
		DataField variable = getVariable(context);
		variable.setValue(actualValue, context);
		return 0;
	}

	@Override
	public List<CheckViolation> check(final Context context) {
		List<CheckViolation> violations = new ArrayList<CheckViolation>();
		violations.addAll(this.value.check(context));
		violations.addAll(this.varSelector.check(context));

		// if the expression on its own returns violations the value can't be
		// checked.
		if (violations.size() > 0) {
			return violations;
		}

		DataField variable = getVariable(context);
		if (!variable.getType().equals(Helper.getValue(this.value, context).getType())) {
			violations.add(new CheckViolation("The types of the assignment did not match.", this.getClass()));
		}

		return violations;
	}

	private DataField getVariable(final Context context) {
		Object rawVariable = this.varSelector.interpret(context);
		assert rawVariable instanceof DataField : "The object returned by the ident selector was not of the type DataField";
		return (DataField) rawVariable;
	}
}
