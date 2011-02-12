package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;

public class ModuleNode implements IInterpretableNode {
	private IInterpretableNode declarations;
	private IInterpretableNode body;
	
	public ModuleNode(String name1, String name2, IInterpretableNode declarations, IInterpretableNode body) {
		if (! name1.equals(name2)) {
			throw new RuntimeException("Module START-identifier and END-identifier aren't equals: " +name1+ "<>" +name2);
		}
		
		this.declarations = declarations;
		this.body = body;
	}
	
	@Override
	public Object interpret(Environment env) {
		declarations.interpret(env);
		body.interpret(env);
		
		return null;
	}

}
