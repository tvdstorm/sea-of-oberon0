package nl.bve.uva.oberon.env.values;


/**
 * A wrapper class for the IntValue type. The only thing this
 * ConstantValue type does, is to prevent any new value be
 * assigned to the underlying IntValue type.
 * 
 * @author Bart v. Eijkelenburg
 *
 */
public class ConstantValue extends IntValue {
	public ConstantValue(int value) {
		super(value);
	}
	
	@Override
	public void setValue(OberonValue value) {
		throw new RuntimeException("Cannot change the value of a CONSTANT!");
	}
	
	@Override
	public boolean typeEquals(OberonValue obj) {
		return (obj != null && obj instanceof ConstantValue);
	}
	
	@Override
	public ConstantValue clone() {
		return new ConstantValue(getValue());
	}
}