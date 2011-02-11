package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.env.Environment;

public class RecordTypeNode implements IInterpretableNode {
	private List<IInterpretableNode> fieldList;
	
	public RecordTypeNode(List<IInterpretableNode> fieldList) {
		this.fieldList = fieldList;
	}
	
	@Override
	public Object interpret(Environment env) {
		// TODO Auto-generated method stub
		return null;
	}
}
