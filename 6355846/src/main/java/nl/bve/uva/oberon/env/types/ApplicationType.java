package nl.bve.uva.oberon.env.types;

/**
 * Class for application-defined types. If there is a type declaration
 * in the Oberon-0 source code, it will be instantiated with this class.
 * The new ApplicationType object will be added in the Environment and can
 * be used to create a new Oberon user-defined-type variable.
 * 
 * @author Bart v. Eijkelenburg
 */
public class ApplicationType extends OberonType {
	private String name;
	private OberonType value;
	
	public ApplicationType(String name, OberonType value) {
		if (name == null && "".equals(name) || value == null) {
			throw new IllegalArgumentException("Cannot instantiate an ApplicationType with a null or empty value: (name: '" +name+ "', value: '" +value+ "'!");
		}
		
		this.name = name;
		this.value = value.clone();
	}
	
	@Override
	public Integer getValue() {
		return value.getValue();
	}
	
	@Override
	public void setValue(OberonType value) {
		if (! this.typeEquals(value)) {
			throw new RuntimeException("Can not assign\n" +value+ " to \n" +this+ "!");
		}
		this.value = ((ApplicationType)value).value;
	}
	
	@Override
	public OberonType evaluateSelector(String selector) {
		OberonType result = value.evaluateSelector(selector);
		
		if (result == null) {
			throw new RuntimeException("There is no '" +selector+ "' for this ApplicationType!");
		}
		
		return result;
	}
	
	@Override
	public boolean typeEquals(OberonType obj) {
		if (obj != null && obj instanceof ApplicationType && this.name.equals(((ApplicationType)obj).name)) {
			return value.typeEquals(((ApplicationType)obj).value);
		} else {
			return false;
		}
	}
	
	@Override
	public ApplicationType clone() {
		return new ApplicationType(name, value.clone());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ApplicationType[" +name+ ": " +value.toString()+ "]");
		return sb.toString();
	}
}
