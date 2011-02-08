package nl.bve.uva.oberon.ast;

public class ProcedureHeadingNode implements IInterpretableNode {
	private String name;
	private IInterpretableNode params;
	
	public ProcedureHeadingNode(String name, IInterpretableNode params) {
		this.name = name;
		this.params = params;
	}
	
	@Override
	public Object interpret() {
		return null;
	}
}
