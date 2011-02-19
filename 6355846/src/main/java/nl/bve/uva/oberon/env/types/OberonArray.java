package nl.bve.uva.oberon.env.types;

import nl.bve.uva.oberon.shared.SelectorValue;

/**
 * OberonArray is an OberonValue for containing multiple values of the
 * same kind. An OberonArray can contain every kind of OberonValue.
 * 
 * @author Bart v. Eijkelenburg *
 */
public class OberonArray extends OberonValue {
	private String type;
	private OberonValue[] values;
	
	private OberonArray() { /* only for cloning purposes */ }
	
	public OberonArray(OberonValue value, int size) {
		values = new OberonValue[size];
		for (int i=0; i < values.length; i++) {
			values[i] = value.clone();
		}
		type = value.getClass().getCanonicalName();
	}
	
	@Override
	public Integer getValue() {
		throw new RuntimeException("Cannot get the value of an Array!");
	}
	
	@Override
	public void setValue(OberonValue value) {
		if (! this.typeEquals(value)) {
			throw new RuntimeException("Can not assign\n" +value+ " to \n" +this+ "!");
		}
		this.values = ((OberonArray)value).values;
	}
	
	@Override
	public OberonValue evaluateSelector(SelectorValue selector) {
		return values[selector.getIndex().getValue()];
	}
	
	@Override
	public boolean typeEquals(OberonValue obj) {
		boolean result = false;
		
		if (obj != null && obj instanceof OberonArray) {
			if (values.length == ((OberonArray)obj).values.length) {
				if (type.equals(((OberonArray)obj).type)) {
					result = true;
				}
			}
		}
		
		return result;
	}
	
	@Override
	public OberonArray clone() {
		OberonArray clone = new OberonArray();
		OberonValue[] newValues = new OberonValue[values.length];
		
		for (int i=0; i < newValues.length; i++) {
			newValues[i] = values[i].clone();
		}
		
		clone.values = newValues;
		clone.type = type;
		
		return clone;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("OberonArray[ " +type+ " : " +values.length+ "]");
		return sb.toString();
	}
}
