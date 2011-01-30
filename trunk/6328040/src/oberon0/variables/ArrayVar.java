package oberon0.variables;

import java.util.ArrayList;

import oberon0.exceptions.IllegalVariableValueException;

public class ArrayVar extends BaseReadableVar implements IWriteableVar, ISelectorableVar{
	private ArrayList<IReadableVar> _value; 
	 
	public ArrayVar(String name, int arraySize){
		super(name);
		_value = new ArrayList<IReadableVar>();
		//make sure array is the right size
		for (int i=0; i<=arraySize; i++){
			//TODO set right type of array
			IReadableVar emptyVar = new IntegerVar(getName());
			_value.add(emptyVar);
		}
	}
	
	@SuppressWarnings("unchecked") //TODO, but how?
	@Override
	public void setValue(Object newValue) throws IllegalVariableValueException{
		if (newValue instanceof ArrayList<?>){
			_value = (ArrayList<IReadableVar>) newValue;
		}
		else throw new IllegalVariableValueException(getType().toString(), newValue.toString());
	}
	public void setValueAtSelector(IReadableVar selector, IReadableVar newValue) {
		setValueAtSelector((Integer) selector.getValue(), newValue);
	}
	public void setValueAtSelector(int selector, IReadableVar newValue) {
	//	newValue.setName(getName());
		_value.set((Integer) selector, newValue);
	}

	@Override
	public VariableTypes getType() {
		return VariableTypes.ARRAY;
	}

	@Override
	public Object getValue() {
		return _value;
	}
	@Override
	public IReadableVar getValueAtSelector(IntegerVar selector) {
		int selectorValue = (Integer) selector.getValue();
		IReadableVar valueAtSelector = getValueAtSelector(selectorValue);
		
		valueAtSelector.setSourceName(getName());
		valueAtSelector.setSourceSelector(selectorValue);
		
		return valueAtSelector;
	}
	@Override
	public IReadableVar getValueAtSelector(int selector) {
		return _value.get(selector);
	}
	
	public int getLength() {
		return _value.size();
	}	
	
}
