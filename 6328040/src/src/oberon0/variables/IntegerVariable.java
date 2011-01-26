package oberon0.variables;

import oberon0.exceptions.IllegalVariableValueException;


public class IntegerVariable implements IVariable, IWriteableValue{
	private int _value;

	public IntegerVariable(){
		
	}
	
	public IntegerVariable(int value){
		_value= value;
	}
	
	public void setValue(Object newValue) throws IllegalVariableValueException{
		 if ( newValue instanceof Integer){
	        	_value = (Integer)newValue;
		 }
		 else throw new IllegalVariableValueException(getType().toString(), newValue.toString());
	}

	public VariableTypes getType() {
		return VariableTypes.INTEGER;
	}

	public Object getValue() {
		return _value;
	}
	
	public void print(){
		System.out.println("Integer has value: " + _value);
	}
}
