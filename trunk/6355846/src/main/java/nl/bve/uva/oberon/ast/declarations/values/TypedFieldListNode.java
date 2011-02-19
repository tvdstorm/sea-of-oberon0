package nl.bve.uva.oberon.ast.declarations.values;

import java.util.HashMap;
import java.util.List;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.OberonValue;

public class TypedFieldListNode implements IInterpretableNode {
	private List<String> identList;
	private TypeNode type;
	
	public TypedFieldListNode(List<String> identList, TypeNode type) {
		this.identList = identList;
		this.type = type;
	}
	
	@Override
	public HashMap<String, OberonValue> interpret(Environment env) {
		HashMap<String, OberonValue> fields = new HashMap<String, OberonValue>();
		OberonValue value = (OberonValue)type.initializeNew(env);
		
		for (String ident : identList) {
			fields.put(ident, value.clone());
		}
		
		return fields;
	}
}
