package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;

public class UserTypeNode implements IInterpretableNode {
	private String name;
	
	public UserTypeNode(String name) {
		this.name = name;
	}
	
	@Override
	public Object interpret(Environment env) {
		return env.createApplicationType(name);
	}
}
