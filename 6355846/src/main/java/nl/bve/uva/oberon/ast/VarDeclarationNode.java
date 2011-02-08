package nl.bve.uva.oberon.ast;

public class VarDeclarationNode implements IInterpretableNode {
	private IInterpretableNode identList;
	private IInterpretableNode type;
	
	public VarDeclarationNode(IInterpretableNode identList, IInterpretableNode type) {
		this.identList = identList;
		this.type = type;
	}
	
	@Override
	public Object interpret() {
		// TODO Auto-generated method stub
		return null;
	}
}
