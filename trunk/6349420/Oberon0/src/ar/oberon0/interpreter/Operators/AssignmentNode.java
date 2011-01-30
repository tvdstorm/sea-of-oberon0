package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.DataField;
import ar.oberon0.interpreter.Memory.IdentSelector;

/*
 * Node that executes the logic of an oberon 0 assignment. It takes a selector for selection the variable to set
 * and an interpretable node that evaluates to a value to set in the variable (DataField).
 */
public class AssignmentNode implements Interpretable
{
	private IdentSelector _variable;
	private Interpretable _value;

	@Override
	public Object Interpret(Context context) throws Exception
	{
		if (_variable == null)
		{
			throw new NullPointerException("The variable in the assignment node can't be null.");
		}

		// Get the variable to set.
		Object rawVariable = _variable.Interpret(context);
		if (!(rawVariable instanceof DataField))
		{
			throw new Exception("The object returned by the ident selector was not of the type DataField.");
		}

		DataField variable = (DataField) rawVariable;
		// Get the value to insert into the variable.
		DataType value = Helper.getDataType(_value, context);
		// Set the value of the variable.
		variable.setValue(value, context);
		return 0;
	}

	public AssignmentNode(IdentSelector variable, Interpretable value)
	{
		_variable = variable;
		_value = value;
	}

}
