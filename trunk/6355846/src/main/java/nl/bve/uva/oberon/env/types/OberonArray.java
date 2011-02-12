package nl.bve.uva.oberon.env.types;

public class OberonArray extends Type {
	private Type[] values;
	
	public OberonArray(Type value, int size) {
		values = new Type[size];
		for (int i=0; i < values.length; i++) {
			values[i] = value.clone();
		}
	}
	
	@Override
	public Integer getValue() {
		throw new RuntimeException("Cannot get the value of an Array!");
	}
	
	@Override
	public void setValue(Type t) {
		throw new RuntimeException("Cannot set the value of an Array!");
	}
	
	@Override
	public Type evaluateSelector(String selector) {
		return values[Integer.parseInt(selector)];
	}
	
	@Override
	public Type clone() {
		return new OberonArray(values[0], this.values.length);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("OberonArray:");
		for (Type t : values) {
			sb.append("[" +t.toString()+ "]");
		}
		
		return sb.toString();
	}
}
