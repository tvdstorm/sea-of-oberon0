package nl.bve.uva.oberon.env.values;

import nl.bve.uva.oberon.shared.SelectorValue;

/**
 * Class for application-defined types. If there is a type declaration
 * in the Oberon-0 source code, it will be instantiated with this class.
 * The new TypeValue object will be added in the Environment and can
 * be used to create a new Oberon user-defined-type variable.
 * 
 * @author Bart v. Eijkelenburg
 */
public class TypeValue extends OberonValue {
	private String name;
	private OberonValue value;
	
	public TypeValue(String name, OberonValue value) {
		if (name == null && "".equals(name) || value == null) {
			throw new IllegalArgumentException("Cannot instantiate an TypeValue with a null or empty value: (name: '" +name+ "', value: '" +value+ "'!");
		}
		
		this.name = name;
		this.value = value.clone();
	}
	
	@Override
	public void setValue(OberonValue value) {
		if (! this.typeEquals(value)) {
			throw new RuntimeException("Can not assign\n" +value+ " to \n" +this+ "!");
		}
		this.value = ((TypeValue)value).value;
	}
	
	@Override
	public OberonValue evaluateSelector(SelectorValue selector) {
		OberonValue result = value.evaluateSelector(selector);
		
		if (result == null) {
			throw new RuntimeException("There is no '" +selector+ "' for this TypeValue!");
		}
		
		return result;
	}
	
	@Override
	public boolean typeEquals(OberonValue obj) {
		if (obj != null && obj instanceof TypeValue && this.name.equals(((TypeValue)obj).name)) {
			return value.typeEquals(((TypeValue)obj).value);
		} else {
			return false;
		}
	}
	
	@Override
	public TypeValue clone() {
		return new TypeValue(name, value.clone());
	}
}