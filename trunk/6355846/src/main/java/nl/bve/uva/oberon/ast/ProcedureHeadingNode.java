package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.env.Environment;

public class ProcedureHeadingNode implements IInterpretableNode {
	private List<IInterpretableNode> params;
	
	public ProcedureHeadingNode(List<IInterpretableNode> params) {
		this.params = params;
	}
	
	@Override
	public Object interpret(Environment env) {
		return null;
	}
}
