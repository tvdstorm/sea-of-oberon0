package oberon0.variables;

import oberon0.exceptions.IllegalVariableValueException;

public interface IWriteableValue {
	public void setValue(Object newValue) throws IllegalVariableValueException;
}
