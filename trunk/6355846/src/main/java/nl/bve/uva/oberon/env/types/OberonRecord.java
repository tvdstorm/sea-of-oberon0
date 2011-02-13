package nl.bve.uva.oberon.env.types;

import java.util.HashMap;
import java.util.Map;

public class OberonRecord extends OberonType {
	private final Map<String, OberonType> fields;
	
	public OberonRecord(Map<String, OberonType> fields) {
		this.fields = fields;
	}
	
	@Override
	public Integer getValue() {
		throw new RuntimeException("Cannot get the value of an Array!");
	}
	
	@Override
	public void setValue(OberonType t) {
		throw new RuntimeException("Cannot set the value of an Array!");
	}
	
	@Override
	public OberonType evaluateSelector(String selector) {
		OberonType result = fields.get(selector);
		
		if (result == null) {
			throw new RuntimeException("There is no field '" +selector+ "' for this OberonRecord!");
		}
		
		return result;
	}
	
	@Override
	public OberonType clone() {
		HashMap<String, OberonType> fieldsCopy = new HashMap<String, OberonType>();
		
		for(Map.Entry<String, OberonType> entry : fields.entrySet()) {
			fieldsCopy.put(entry.getKey(), entry.getValue().clone());
		}
		
		return new OberonRecord(fieldsCopy);
	}
}
