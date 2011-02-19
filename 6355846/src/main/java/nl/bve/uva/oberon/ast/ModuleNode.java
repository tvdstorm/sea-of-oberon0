package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;

public class ModuleNode implements IExecutableNode {
	private IExecutableNode declarations;
	private IExecutableNode body;
	
	public ModuleNode(String name1, String name2, IExecutableNode declarations, IExecutableNode body) {
		if (! name1.equals(name2)) {
			throw new RuntimeException("Module START-identifier and END-identifier aren't equals: " +name1+ "<>" +name2);
		}
		
		this.declarations = declarations;
		this.body = body;
	}
	
	@Override
	public void execute(Environment env) {
		declarations.execute(env);
		body.execute(env);
	}
}
