package nl.bve.uva.oberon.env.types;

import java.util.HashMap;
import java.util.Map;

import nl.bve.uva.oberon.shared.SelectorValue;

/**
 * An OberonRecord contains a mapping to several fields. Each field
 * is an OberonType and can be accessed through the evaluateSelector
 * method.  
 * 
 * @author Bart v. Eijkelenburg
 *
 */
public class OberonRecord extends OberonType {
	private Map<String, OberonType> fields;
	
	public OberonRecord(Map<String, OberonType> fields) {
		this.fields = fields;
	}
	
	@Override
	public Integer getValue() {
		throw new RuntimeException("Cannot get the value of an Array!");
	}
	
	@Override
	public void setValue(OberonType value) {
		if (! this.typeEquals(value)) {
			throw new RuntimeException("Can not assign\n" +value+ " to \n" +this+ "!");
		}
		this.fields = ((OberonRecord)value).fields;
	}
	
	@Override
	public OberonType evaluateSelector(SelectorValue selector) {
		OberonType result = fields.get(selector.getField());
		
		if (result == null) {
			throw new RuntimeException("There is no field '" +selector+ "' for this OberonRecord!");
		}
		
		return result;
	}
	
	@Override
	public boolean typeEquals(OberonType obj) {
		boolean result = false;
		
		if (obj != null && obj instanceof OberonRecord) {
			OberonRecord other = (OberonRecord)obj;
			
			if (fields != null && other.fields != null && (fields.size() == other.fields.size())) {
				result = true;
				for (Map.Entry<String, OberonType> entry : fields.entrySet()) {
					String ownField = entry.getKey();
					OberonType ownType = entry.getValue();
					
					OberonType otherType = other.fields.get(ownField);
					
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
		HashMap<String, OberonType> fieldsCopy = new HashMap<String, OberonType>();
		
		for(Map.Entry<String, OberonType> entry : fields.entrySet()) {
			fieldsCopy.put(entry.getKey(), entry.getValue().clone());
		}
		
		return new OberonRecord(fieldsCopy);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("OberonRecord: {");
		
		if (fields != null) {
			for (Map.Entry<String, OberonType> entry : fields.entrySet()) {
				sb.append(" [" +entry.getKey()+ " : " +entry.getValue()+ "] ");
			}
		} 
		
		sb.append("}");
		
		return sb.toString();
	}
}
