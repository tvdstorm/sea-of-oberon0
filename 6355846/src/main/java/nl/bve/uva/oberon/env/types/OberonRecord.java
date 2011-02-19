package nl.bve.uva.oberon.env.types;

import java.util.HashMap;
import java.util.Map;

import nl.bve.uva.oberon.shared.SelectorValue;

/**
 * An OberonRecord contains a mapping to several fields. Each field
 * is an OberonValue and can be accessed through the evaluateSelector
 * method.  
 * 
 * @author Bart v. Eijkelenburg
 *
 */
public class OberonRecord extends OberonValue {
	private Map<String, OberonValue> fields;
	
	public OberonRecord(Map<String, OberonValue> fields) {
		this.fields = fields;
	}
	
	@Override
	public Integer getValue() {
		throw new RuntimeException("Cannot get the value of an Array!");
	}
	
	@Override
	public void setValue(OberonValue value) {
		if (! this.typeEquals(value)) {
			throw new RuntimeException("Can not assign\n" +value+ " to \n" +this+ "!");
		}
		this.fields = ((OberonRecord)value).fields;
	}
	
	@Override
	public OberonValue evaluateSelector(SelectorValue selector) {
		OberonValue result = fields.get(selector.getField());
		
		if (result == null) {
			throw new RuntimeException("There is no field '" +selector+ "' for this OberonRecord!");
		}
		
		return result;
	}
	
	@Override
	public boolean typeEquals(OberonValue obj) {
		boolean result = false;
		
		if (obj != null && obj instanceof OberonRecord) {
			OberonRecord other = (OberonRecord)obj;
			
			if (fields != null && other.fields != null && (fields.size() == other.fields.size())) {
				result = true;
				for (Map.Entry<String, OberonValue> entry : fields.entrySet()) {
					String ownField = entry.getKey();
					OberonValue ownType = entry.getValue();
					
					OberonValue otherType = other.fields.get(ownField);
					
					if (otherType == null || !otherType.typeEquals(ownType)) {
						result = false;
						break;
					}
				}
			} else if (fields == null && other.fields == null) {
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public OberonRecord clone() {
		HashMap<String, OberonValue> fieldsCopy = new HashMap<String, OberonValue>();
		
		for(Map.Entry<String, OberonValue> entry : fields.entrySet()) {
			fieldsCopy.put(entry.getKey(), entry.getValue().clone());
		}
		
		return new OberonRecord(fieldsCopy);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("OberonRecord: {");
		
		if (fields != null) {
			for (Map.Entry<String, OberonValue> entry : fields.entrySet()) {
				sb.append(" [" +entry.getKey()+ " : " +entry.getValue()+ "] ");
			}
		} 
		
		sb.append("}");
		
		return sb.toString();
	}
}
