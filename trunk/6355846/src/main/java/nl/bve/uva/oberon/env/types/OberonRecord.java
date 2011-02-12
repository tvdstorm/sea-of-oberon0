package nl.bve.uva.oberon.env.types;

import java.util.HashMap;
import java.util.Map;

public class OberonRecord extends Type {
	private final Map<String, Type> fields;
	
	public OberonRecord(Map<String, Type> fields) {
		this.fields = fields;
	}
	
	@Override
	public Integer getValue() {
		throw new RuntimeException("Cannot get the value of an Array!");
	}
	
	@Override
	public void setValue(Type t) {
		throw new RuntimeException("Cannot set the value of an Array!");
	}
	
	@Override
	public Type evaluateSelector(String selector) {
		return fields.get(selector);
	}
	
	@Override
	public Type clone() {
		HashMap<String, Type> fieldsCopy = new HashMap<String, Type>();
		
		for(Map.Entry<String, Type> entry : fields.entrySet()) {
			fieldsCopy.put(entry.getKey(), entry.getValue().clone());
		}
		
		return new OberonRecord(fieldsCopy);
	}
}
