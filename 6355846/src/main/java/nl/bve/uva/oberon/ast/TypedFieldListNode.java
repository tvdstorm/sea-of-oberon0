package nl.bve.uva.oberon.ast;

import java.util.HashMap;
import java.util.List;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonType;

public class TypedFieldListNode implements IInterpretableNode {
	private List<String> identList;
	private IInterpretableNode type;
	
	public TypedFieldListNode(List<String> identList, IInterpretableNode type) {
		this.identList = identList;
		this.type = type;
	}
	
	@Override
	public HashMap<String, OberonType> interpret(Environment env) {
		HashMap<String, OberonType> fields = new HashMap<String, OberonType>();
		OberonType value = (OberonType)type.interpret(env);
		
		for (String ident : identList) {
			fields.put(ident, value.clone());
		}
		
		return fields;
	}
}
