package oberon0.variables;

import oberon0.exceptions.IllegalVariableValueException;

public interface IWriteableVar extends IVariable{
	public void setValue(Object newValue) throws IllegalVariableValueException;
}
