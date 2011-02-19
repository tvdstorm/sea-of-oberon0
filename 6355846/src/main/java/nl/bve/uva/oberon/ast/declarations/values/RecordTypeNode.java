package nl.bve.uva.oberon.ast.declarations.values;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.OberonValue;
import nl.bve.uva.oberon.env.values.RecordValue;

public class RecordTypeNode implements ITypeNode {
	private List<TypedFieldListNode> fieldLists;
	
	public RecordTypeNode(List<TypedFieldListNode> fieldLists) {
		this.fieldLists = fieldLists;
	}
	
	@Override
	public OberonValue initializeNew(Environment env) {
		Map<String, OberonValue> fields = new HashMap<String, OberonValue>();
		
		for (TypedFieldListNode fieldList : fieldLists) {
			Map<String, OberonValue> newFields = fieldList.list(env);
			for (Map.Entry<String, OberonValue> entry : newFields.entrySet()) {
				fields.put(entry.getKey(), entry.getValue());
			}
		}
		
		return new RecordValue(fields);
	}
}
