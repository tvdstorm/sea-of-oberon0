package oberon0.variables;

import oberon0.exceptions.IllegalVariableValueException;


public class IntegerVar extends BaseReadableVar implements IWriteableVar{
	private int _value;

	public IntegerVar(String name){
		super(name);
	}
	
	public IntegerVar(String name, int value){
		super(name);
		_value= value;
	}
	
	@Override
	public void setValue(Object newValue) throws IllegalVariableValueException{
		 if ( newValue instanceof Integer){
	        	_value = (Integer)newValue;
		 }
		 else throw new IllegalVariableValueException(getType().toString(), newValue.toString());
	}

	@Override
	public VariableTypes getType() {
		return VariableTypes.INTEGER;
	}

	@Override
	public Object getValue() {
		return _value;
	}
}
