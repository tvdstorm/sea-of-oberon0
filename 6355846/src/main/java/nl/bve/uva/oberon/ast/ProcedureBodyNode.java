package nl.bve.uva.oberon.ast;

public class ProcedureBodyNode implements IInterpretableNode {
	private IInterpretableNode declarations;
	private IInterpretableNode body;
	private String name;
	
	public ProcedureBodyNode(IInterpretableNode declarations, IInterpretableNode body, String name) {
		this.declarations = declarations;
		this.body = body;
		this.name = name;
	}
	
	@Override
	public Object interpret() {
		// TODO Auto-generated method stub
		return null;
	}
}
