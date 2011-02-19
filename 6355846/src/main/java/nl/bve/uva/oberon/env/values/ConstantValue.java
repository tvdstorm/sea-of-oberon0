package nl.bve.uva.oberon.env.values;

import nl.bve.uva.oberon.shared.SelectorValue;

/**
 * A wrapper class for the IntValue type. The only thing this
 * ConstantValue type does, is to prevent any new value be
 * assigned to the underlying IntValue type.
 * 
 * @author Bart v. Eijkelenburg
 *
 */
public class ConstantValue extends OberonValue {
	private IntValue value;
	
	public ConstantValue(IntValue value) {
		this.value = value;
	}
	
	@Override
	public Integer getValue() {
		return value.getValue();
	}
	
	@Override
	public void setValue(OberonValue value) {
		throw new RuntimeException("Cannot change the value of a CONSTANT!");
	}
	
	@Override
	public OberonValue evaluateSelector(SelectorValue selector) {
		throw new RuntimeException("Cannot evaluate an IntValue type!");
	}
	
	@Override
	public boolean typeEquals(OberonValue obj) {
		return (obj != null && obj instanceof ConstantValue);
	}
	
	@Override
	public OberonValue clone() {
		return new ConstantValue(value);
	}
	
	@Override
	public String toString() {
		return "ConstantValue[" +value.toString()+ "]";
	}
}
