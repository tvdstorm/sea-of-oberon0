package nl.bve.uva.oberon.env.types;

import nl.bve.uva.oberon.shared.SelectorValue;

/**
 * A wrapper class for the OberonInt type. The only thing this
 * OberonConstant type does, is to prevent any new value be
 * assigned to the underlying OberonInt type.
 * 
 * @author Bart v. Eijkelenburg
 *
 */
public class OberonConstant extends OberonType {
	private OberonInt value;
	
	public OberonConstant(OberonInt value) {
		this.value = value;
	}
	
	@Override
	public Integer getValue() {
		return value.getValue();
	}
	
	@Override
	public void setValue(OberonType value) {
		throw new RuntimeException("Cannot change the value of a CONSTANT!");
	}
	
	@Override
	public OberonType evaluateSelector(SelectorValue selector) {
		throw new RuntimeException("Cannot evaluate an OberonInt type!");
	}
	
	@Override
	public boolean typeEquals(OberonType obj) {
		return (obj != null && obj instanceof OberonConstant);
	}
	
	@Override
	public OberonType clone() {
		return new OberonConstant(value);
	}
	
	@Override
	public String toString() {
		return "OberonConstant[" +value.toString()+ "]";
	}
}
