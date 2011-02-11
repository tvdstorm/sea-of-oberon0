package nl.bve.uva.oberon.env.types;

import nl.bve.uva.oberon.env.Environment;



public class OberonArray extends Type {
	private Type[] values;
	
	private OberonArray() { /* for cloning only */ }
	
	public OberonArray(Type value, int size) {
		values = new Type[size];
		for (int i=0; i < values.length; i++) {
			values[i] = value.clone();
		}
	}
	
	public void changeValue(int position, Type value) {
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
	
	@Override
	public Type clone() {
		return new OberonArray(values[0], this.values.length);
	}
	
	@Override
	public Type evaluateSelector(Object o) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Integer interpret(Environment env) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "OberonArray[" +values.length+ "]: " +values[0].getClass().getCanonicalName();
	}
}
