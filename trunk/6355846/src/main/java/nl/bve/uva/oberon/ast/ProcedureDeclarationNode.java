package nl.bve.uva.oberon.ast;

public class ProcedureDeclarationNode implements IInterpretableNode {
	private IInterpretableNode heading;
	private IInterpretableNode body;
	
	public ProcedureDeclarationNode(IInterpretableNode heading, IInterpretableNode body) {
		this.heading = heading;
		this.body = body;
	}
	
	@Override
	public Object interpret() {
		// TODO Auto-generated method stub
		return null;
	}
}
