package oberon;

import oberon.data.DataType;
import oberon.data.Selector;

public class AssignmentStatement extends Statement {
	private Selector _name;
	private Expression _value;

	public AssignmentStatement(Selector name, Expression value)
	{
		_name = name;
		_value = value;
	}
	
	@Override
	public void Eval() {
		DataType type = _name.getDataTypeValue();
		type.setValue(_value.EvalAsInt());
	}

}
