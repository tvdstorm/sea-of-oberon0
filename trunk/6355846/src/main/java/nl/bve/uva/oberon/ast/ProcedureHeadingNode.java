package nl.bve.uva.oberon.ast;

import java.util.List;

public class ProcedureHeadingNode implements IInterpretableNode {
	private String name;
	private List<IInterpretableNode> params;
	
	public ProcedureHeadingNode(String name, List<IInterpretableNode> params) {
		this.name = name;
		this.params = params;
	}
	
	@Override
	public Object interpret() {
		return null;
	}
}
