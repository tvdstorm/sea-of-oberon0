package oberon0.variables;

import oberon0.exceptions.IllegalVariableValueException;

public class ArrayVariable implements IVariable, IWriteableValue{
	int[] _value;
	
	public ArrayVariable( int arraySize){
		_value = new int[arraySize];
	}

	public void setValue(Object newValue) throws IllegalVariableValueException{
		 if ( newValue instanceof int[]){
	        	_value = (int[]) newValue;
		 }
		 else throw new IllegalVariableValueException(getType().toString(), newValue.toString());
	}

	public VariableTypes getType() {
		return VariableTypes.ARRAY;
	}

	public Object getValue() {
		return _value;
	}
	
	public int getLength() {
		return _value.length;
	}
	
	public void print(){
		StringBuffer arraybuffer = new StringBuffer();
		arraybuffer = arraybuffer.append(" [ ");
		for ( int i = 0; i < getLength(); i++ )
			arraybuffer = arraybuffer.append( _value[i] );
		arraybuffer = arraybuffer.append(" ] ");
		System.out.println("Array has value: " + arraybuffer);
	}
}
