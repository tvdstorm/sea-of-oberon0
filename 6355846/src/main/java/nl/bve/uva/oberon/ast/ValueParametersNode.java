package nl.bve.uva.oberon.ast;

import java.util.List;

public class ValueParametersNode implements IInterpretableNode {
	private List<String> identList;
	private IInterpretableNode type;
	
	public ValueParametersNode(List<String> identList, IInterpretableNode type) {
		this.identList = identList;
		this.type = type;
	}
	
	@Override
	public Object interpret() {
		// TODO Auto-generated method stub
		return null;
	}
}
