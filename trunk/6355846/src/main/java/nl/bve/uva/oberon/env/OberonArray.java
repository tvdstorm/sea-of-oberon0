package nl.bve.uva.oberon.env;


public class OberonArray<T extends Type> extends Type {
	private Type[] values;
	
	public OberonArray(T type, int size) {
		values = new Type[size];
	}
	
	public void changeValue(int position, T value) {
		assert position >= 0 : "Array index must be a positive number"; 
		assert values.length > position : "Array index out of bounds!";
		
		values[position] = value;
	}
	
	public Type evaluateSelector(String selector) {
		return values[Integer.parseInt(selector)];
	}
	
	@Override
	public void setValue(Object o) {
		throw new RuntimeException("Cannot set the value of an Array!");
	}
	
	@Override
	public Object getValue() {
		throw new RuntimeException("Cannot get the value of an Array!");
	}
}
