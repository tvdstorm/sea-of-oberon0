package nl.bve.uva.oberon.env.types;

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
public class OberonInt extends OberonType {
	public static final int FALSE = 0;
	public static final int TRUE  = 1;
	
	private int value;
	
	public OberonInt(int value) {
		this.value = value;
	}
	
	@Override
	public Integer getValue() {
		return value;
	}
	
	@Override
	public void setValue(OberonType value) {
		if (! this.typeEquals(value)) {
			throw new RuntimeException("Can not assign\n" +value+ " to \n" +this+ "!");
		}
		this.value = ((OberonInt)value).value;
	}
	
	@Override
	public OberonType evaluateSelector(SelectorValue selector) {
		throw new RuntimeException("Cannot evaluate an OberonInt type!");
	}
	
	@Override
	public boolean typeEquals(OberonType obj) {
		return (obj != null && obj instanceof OberonInt);
	}
	
	@Override
	public OberonInt clone() {
		return new OberonInt(value);
	}
	
	@Override
	public String toString() {
		return "OberonInt";
	}
}
