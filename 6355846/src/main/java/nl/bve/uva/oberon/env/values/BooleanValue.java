package nl.bve.uva.oberon.env.values;

/**
 * This class is one of the two backbonen of all the OberonTypes other
 * than Int ant Boolean. It contains a boolean value that can be changed 
 * using the setValue method. Likewise, it can be accessed using the 
 * getValue method.
 * 
 * @author Bart v. Eijkelenburg
 *
 */
public class BooleanValue extends OberonValue {
	private boolean value;

	public BooleanValue(boolean value) {
		this.value = value;
	}
	
	public Boolean getValue() {
		return value;
	}
	
	@Override
	public void setValue(OberonValue value) {
		if (! this.typeEquals(value)) {
			throw new RuntimeException("Can not assign\n" +value+ " to \n" +this+ "!");
		}
		this.value = ((BooleanValue)value).value;
	}
	
	@Override
	public boolean typeEquals(OberonValue obj) {
		return (obj != null && obj instanceof BooleanValue);
	}
	
	@Override
	public BooleanValue clone() {
		return new BooleanValue(value);
	}
}