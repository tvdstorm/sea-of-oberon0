package nl.bve.uva.oberon.env.values;

import nl.bve.uva.oberon.shared.SelectorValue;

/**
 * This class is the backbone of all the other OberonTypes. It 
 * contains an int value that can be changed using the setValue
 * method. Likewise, it can be accessed using the getValue method.
 * 
 * It also contains two constants that can be used in Boolean-comparisons.
 * 
 * @author Bart v. Eijkelenburg
 *
 */
public class IntValue extends OberonValue {
	public static final int FALSE = 0;
	public static final int TRUE  = 1;
	
	private int value;
	
	public IntValue(int value) {
		this.value = value;
	}
	
	@Override
	public Integer getValue() {
		return value;
	}
	
	@Override
	public void setValue(OberonValue value) {
		if (! this.typeEquals(value)) {
			throw new RuntimeException("Can not assign\n" +value+ " to \n" +this+ "!");
		}
		this.value = ((IntValue)value).value;
	}
	
	@Override
	public OberonValue evaluateSelector(SelectorValue selector) {
		throw new RuntimeException("Cannot evaluate an IntValue type!");
	}
	
	@Override
	public boolean typeEquals(OberonValue obj) {
		return (obj != null && obj instanceof IntValue);
	}
	
	@Override
	public IntValue clone() {
		return new IntValue(value);
	}
}