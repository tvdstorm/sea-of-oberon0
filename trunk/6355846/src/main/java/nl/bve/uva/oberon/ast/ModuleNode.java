package nl.bve.uva.oberon.ast;

public class ModuleNode implements IInterpretableNode {
	private String name;
	private IInterpretableNode declarations;
	private IInterpretableNode body;
	
	public ModuleNode(String name1, String name2, IInterpretableNode declarations, IInterpretableNode body) {
		// hier testen voor name1 equals name2??
		this.name = name1;
		this.declarations = declarations;
		this.body = body;
	}
	
	@Override
	public Object interpret() {
		// TODO Auto-generated method stub
		return null;
	}

}
