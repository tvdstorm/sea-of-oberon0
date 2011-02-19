package nl.bve.uva.oberon.env.values;

import nl.bve.uva.oberon.shared.SelectorValue;

/**
 * ArrayValue is an OberonValue for containing multiple values of the
 * same kind. An ArrayValue can contain every kind of OberonValue.
 * 
 * @author Bart v. Eijkelenburg *
 */
public class ArrayValue extends OberonValue {
	private String type;
	private OberonValue[] values;
	
	private ArrayValue() { /* only for cloning purposes */ }
	
	public ArrayValue(OberonValue value, int size) {
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
		this.values = ((ArrayValue)value).values;
	}
	
	@Override
	public OberonValue evaluateSelector(SelectorValue selector) {
		return values[selector.getIndex().getValue()];
	}
	
	@Override
	public boolean typeEquals(OberonValue obj) {
		boolean result = false;
		
		if (obj != null && obj instanceof ArrayValue) {
			if (values.length == ((ArrayValue)obj).values.length) {
				if (type.equals(((ArrayValue)obj).type)) {
					result = true;
				}
			}
		}
		
		return result;
	}
	
	@Override
	public ArrayValue clone() {
		ArrayValue clone = new ArrayValue();
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
		sb.append("ArrayValue[ " +type+ " : " +values.length+ "]");
		return sb.toString();
	}
}
