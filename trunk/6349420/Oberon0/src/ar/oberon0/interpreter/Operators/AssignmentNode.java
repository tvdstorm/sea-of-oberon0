package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.Memory.*;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.Memory.Selector;

public class AssignmentNode implements Interpretable {

	private Selector _variable;
	private Interpretable _value;

	@Override
	public Object Interpret(Context context) throws Exception {
		Var variable = (Var)_variable.Interpret(context);
		DataType value = (DataType)_value.Interpret(context);
		variable.setValue(context, value);
		return "Ok";
	}
	
	public AssignmentNode(Selector variable, Interpretable value)
	{
		_variable = variable;
		_value = value;
	}


}
