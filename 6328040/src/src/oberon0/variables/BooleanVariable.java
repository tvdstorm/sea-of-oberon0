package oberon0.variables;

import oberon0.exceptions.IllegalVariableValueException;

public class BooleanVariable implements IVariable, IWriteableValue{
	private boolean _value;

	public BooleanVariable(){
	}
	
	public BooleanVariable(boolean value){
		_value= value;
	}
	
	public void setValue(Object newValue) throws IllegalVariableValueException{
		 if ( newValue instanceof Boolean){
	        	_value = (Boolean)newValue;
		 }
		 else throw new IllegalVariableValueException(getType().toString(), newValue.toString());
	}

	public VariableTypes getType() {
		return VariableTypes.BOOLEAN;
	}

	public Object getValue() {
		return _value;
	}
	
	public void print(){
		System.out.println("Boolean has value: " + _value);
	}
}
