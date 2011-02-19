package nl.bve.uva.oberon.ast.types;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.OberonValue;

public class TypedFieldListNode {
	private List<String> identList;
	private IOberonTypeNode type;
	
	public TypedFieldListNode(List<String> identList, IOberonTypeNode type) {
		this.identList = identList;
		this.type = type;
	}
	
	public Map<String, OberonValue> initializeFieldList(Environment env) {
		HashMap<String, OberonValue> fields = new HashMap<String, OberonValue>();
		OberonValue value = (OberonValue)type.initializeNew(env);
		
		for (String ident : identList) {
			fields.put(ident, value.clone());
		}
		
		return fields;
	}
}
