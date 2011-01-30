package oberon0.variables;

import oberon0.exceptions.IllegalVariableValueException;

public class BooleanVar extends BaseReadableVar implements IWriteableVar{
	private boolean _value;

	public BooleanVar(String name){
		super(name);
	}
	
	public BooleanVar(String name, boolean value){
		super(name);
		_value = value;
	}
	
	@Override
	public void setValue(Object newValue) throws IllegalVariableValueException{
		 if ( newValue instanceof Boolean){
	        	_value = (Boolean)newValue;
		 }
		 else throw new IllegalVariableValueException(getType().toString(), newValue.toString());
	}

	@Override
	public VariableTypes getType() {
		return VariableTypes.BOOLEAN;
	}

	@Override
	public Object getValue() {
		return _value;
	}
}
