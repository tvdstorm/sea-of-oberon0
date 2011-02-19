package nl.bve.uva.oberon.ast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.RecordValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class RecordTypeNode implements IInterpretableNode {
	private List<TypedFieldListNode> fieldLists;
	
	public RecordTypeNode(List<TypedFieldListNode> fieldLists) {
		this.fieldLists = fieldLists;
	}
	
	@Override
	public Object interpret(Environment env) {
		Map<String, OberonValue> fields = new HashMap<String, OberonValue>();
		
		for (TypedFieldListNode fieldList : fieldLists) {
			Map<String, OberonValue> newFields = fieldList.interpret(env);
			for (Map.Entry<String, OberonValue> entry : newFields.entrySet()) {
				fields.put(entry.getKey(), entry.getValue());
			}
		}
		
		return new RecordValue(fields);
	}
}
