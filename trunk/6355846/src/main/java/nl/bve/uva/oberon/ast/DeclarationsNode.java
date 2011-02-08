package nl.bve.uva.oberon.ast;

import java.util.List;

public class DeclarationsNode implements IInterpretableNode {
	private List<IInterpretableNode> constants;
	private List<IInterpretableNode> types;
	private List<IInterpretableNode> vars;
	private List<IInterpretableNode> procedures;
	
	public DeclarationsNode(List<IInterpretableNode> constants, 
							List<IInterpretableNode> types, 
							List<IInterpretableNode> vars, 
							List<IInterpretableNode> procedures) {
		
		this.constants = constants;
		this.types = types;
		this.vars = vars;
		this.procedures = procedures;
	}
	
	@Override
	public Object interpret() {
		interpretDeclarations(constants);
		interpretDeclarations(types);
		interpretDeclarations(vars);
		interpretDeclarations(procedures);
		
		return null;
	}
	
	private void interpretDeclarations(List<IInterpretableNode> declarations) {
		for (IInterpretableNode declaration : declarations) {
			declaration.interpret();
		}
	}
}
