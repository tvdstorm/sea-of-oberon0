package nl.bve.uva.oberon.ast;

public class TypeDeclarationNode implements IInterpretableNode {
	private String ident;
	private IInterpretableNode type;
	
	public TypeDeclarationNode(String ident, IInterpretableNode type) {
		this.ident = ident;
		this.type = type;
	}
	
	@Override
	public Object interpret() {
		// TODO Auto-generated method stub
		return null;
	}
}
