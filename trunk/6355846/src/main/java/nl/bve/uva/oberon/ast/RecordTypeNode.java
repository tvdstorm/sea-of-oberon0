package nl.bve.uva.oberon.ast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonRecord;
import nl.bve.uva.oberon.env.types.Type;

public class RecordTypeNode implements IInterpretableNode {
	private List<TypedFieldListNode> fieldLists;
	
	public RecordTypeNode(List<TypedFieldListNode> fieldLists) {
		this.fieldLists = fieldLists;
	}
	
	@Override
	public Object interpret(Environment env) {
		Map<String, Type> fields = new HashMap<String, Type>();
		
		for (TypedFieldListNode fieldList : fieldLists) {
			Map<String, Type> newFields = fieldList.interpret(env);
			for (Map.Entry<String, Type> entry : newFields.entrySet()) {
				fields.put(entry.getKey(), entry.getValue());
			}
		}
		
		return new OberonRecord(fields);
	}
}
