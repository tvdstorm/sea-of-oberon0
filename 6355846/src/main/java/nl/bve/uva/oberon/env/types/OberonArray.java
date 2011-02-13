package nl.bve.uva.oberon.env.types;

public class OberonArray extends OberonType {
	private OberonType[] values;
	
	public OberonArray(OberonType value, int size) {
		values = new OberonType[size];
		for (int i=0; i < values.length; i++) {
			values[i] = value.clone();
		}
	}
	
	@Override
	public Integer getValue() {
		throw new RuntimeException("Cannot get the value of an Array!");
	}
	
	@Override
	public void setValue(OberonType t) {
		throw new RuntimeException("Cannot set the value of an Array!");
	}
	
	@Override
	public OberonType evaluateSelector(String selector) {
		return values[Integer.parseInt(selector)];
	}
	
	@Override
	public OberonType clone() {
		return new OberonArray(values[0], this.values.length);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("OberonArray:");
		for (OberonType t : values) {
			sb.append("[" +t.toString()+ "]");
		}
		
		return sb.toString();
	}
}
