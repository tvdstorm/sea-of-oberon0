package nl.bve.uva.oberon.ast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonRecord;
import nl.bve.uva.oberon.env.types.OberonType;

public class RecordTypeNode implements IInterpretableNode {
	private List<TypedFieldListNode> fieldLists;
	
	public RecordTypeNode(List<TypedFieldListNode> fieldLists) {
		this.fieldLists = fieldLists;
	}
	
	@Override
	public Object interpret(Environment env) {
		Map<String, OberonType> fields = new HashMap<String, OberonType>();
		
		for (TypedFieldListNode fieldList : fieldLists) {
			Map<String, OberonType> newFields = fieldList.interpret(env);
			for (Map.Entry<String, OberonType> entry : newFields.entrySet()) {
				fields.put(entry.getKey(), entry.getValue());
			}
		}
		
		return new OberonRecord(fields);
	}
}
