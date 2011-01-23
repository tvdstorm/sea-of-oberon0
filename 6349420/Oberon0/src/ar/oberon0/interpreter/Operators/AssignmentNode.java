package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.Memory.*;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.Memory.Selector;

public class AssignmentNode implements Interpretable {

	private IdentSelector _variable;
	private Interpretable _value;

	@Override
	public Object Interpret(Context context) throws Exception {
		DataField variable = (DataField)_variable.Interpret(context);
		DataType value = (DataType)_value.Interpret(context);
		variable.setValue(value,context);
		return "Ok";
	}
	
	public AssignmentNode(IdentSelector variable, Interpretable value)
	{
		_variable = variable;
		_value = value;
	}


}
