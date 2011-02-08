package nl.bve.uva.oberon.ast;

public class ConstantDeclarationNode implements IInterpretableNode {
	private String ident;
	private IInterpretableNode expression;
	
	public ConstantDeclarationNode(String ident, IInterpretableNode expression) {
		this.ident = ident;
		this.expression = expression;
	}
	
	@Override
	public Object interpret() {
		// TODO Auto-generated method stub
		return null;
	}
}
